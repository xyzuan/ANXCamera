package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.util.Log;
import com.bumptech.glide.load.engine.A;
import com.bumptech.glide.load.engine.bitmap_recycle.d;
import com.bumptech.glide.load.f;
import com.bumptech.glide.load.g;
import com.bumptech.glide.load.h;
import java.io.IOException;

public class VideoDecoder<T> implements h<T, Bitmap> {
    @VisibleForTesting
    static final int DEFAULT_FRAME_OPTION = 2;
    public static final long Kj = -1;
    public static final f<Long> Lj = f.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new B());
    public static final f<Integer> Mj = f.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new C());
    private static final String TAG = "VideoDecoder";
    private static final MediaMetadataRetrieverFactory Xd = new MediaMetadataRetrieverFactory();
    private final d Eb;
    private final MediaMetadataRetrieverInitializer<T> Jj;
    private final MediaMetadataRetrieverFactory factory;

    @VisibleForTesting
    static class MediaMetadataRetrieverFactory {
        MediaMetadataRetrieverFactory() {
        }

        public MediaMetadataRetriever build() {
            return new MediaMetadataRetriever();
        }
    }

    @VisibleForTesting
    interface MediaMetadataRetrieverInitializer<T> {
        void a(MediaMetadataRetriever mediaMetadataRetriever, T t);
    }

    private static final class a implements MediaMetadataRetrieverInitializer<AssetFileDescriptor> {
        private a() {
        }

        /* synthetic */ a(B b2) {
            this();
        }

        public void a(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }
    }

    static final class b implements MediaMetadataRetrieverInitializer<ParcelFileDescriptor> {
        b() {
        }

        public void a(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    VideoDecoder(d dVar, MediaMetadataRetrieverInitializer<T> mediaMetadataRetrieverInitializer) {
        this(dVar, mediaMetadataRetrieverInitializer, Xd);
    }

    @VisibleForTesting
    VideoDecoder(d dVar, MediaMetadataRetrieverInitializer<T> mediaMetadataRetrieverInitializer, MediaMetadataRetrieverFactory mediaMetadataRetrieverFactory) {
        this.Eb = dVar;
        this.Jj = mediaMetadataRetrieverInitializer;
        this.factory = mediaMetadataRetrieverFactory;
    }

    private static Bitmap a(MediaMetadataRetriever mediaMetadataRetriever, long j, int i) {
        return mediaMetadataRetriever.getFrameAtTime(j, i);
    }

    @Nullable
    private static Bitmap a(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, DownsampleStrategy downsampleStrategy) {
        Bitmap b2 = (Build.VERSION.SDK_INT < 27 || i2 == Integer.MIN_VALUE || i3 == Integer.MIN_VALUE || downsampleStrategy == DownsampleStrategy.NONE) ? null : b(mediaMetadataRetriever, j, i, i2, i3, downsampleStrategy);
        return b2 == null ? a(mediaMetadataRetriever, j, i) : b2;
    }

    @TargetApi(27)
    private static Bitmap b(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, DownsampleStrategy downsampleStrategy) {
        try {
            int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (parseInt3 == 90 || parseInt3 == 270) {
                int i4 = parseInt2;
                parseInt2 = parseInt;
                parseInt = i4;
            }
            float b2 = downsampleStrategy.b(parseInt, parseInt2, i2, i3);
            return mediaMetadataRetriever.getScaledFrameAtTime(j, i, Math.round(((float) parseInt) * b2), Math.round(b2 * ((float) parseInt2)));
        } catch (Throwable th) {
            if (!Log.isLoggable(TAG, 3)) {
                return null;
            }
            Log.d(TAG, "Exception trying to decode frame on oreo+", th);
            return null;
        }
    }

    public static h<AssetFileDescriptor, Bitmap> b(d dVar) {
        return new VideoDecoder(dVar, new a((B) null));
    }

    public static h<ParcelFileDescriptor, Bitmap> c(d dVar) {
        return new VideoDecoder(dVar, new b());
    }

    public boolean a(@NonNull T t, @NonNull g gVar) {
        return true;
    }

    public A<Bitmap> b(@NonNull T t, int i, int i2, @NonNull g gVar) throws IOException {
        long longValue = ((Long) gVar.a(Lj)).longValue();
        if (longValue >= 0 || longValue == -1) {
            Integer num = (Integer) gVar.a(Mj);
            if (num == null) {
                num = 2;
            }
            DownsampleStrategy downsampleStrategy = (DownsampleStrategy) gVar.a(DownsampleStrategy.fj);
            if (downsampleStrategy == null) {
                downsampleStrategy = DownsampleStrategy.DEFAULT;
            }
            DownsampleStrategy downsampleStrategy2 = downsampleStrategy;
            MediaMetadataRetriever build = this.factory.build();
            try {
                this.Jj.a(build, t);
                Bitmap a2 = a(build, longValue, num.intValue(), i, i2, downsampleStrategy2);
                build.release();
                return f.a(a2, this.Eb);
            } catch (RuntimeException e2) {
                throw new IOException(e2);
            } catch (Throwable th) {
                build.release();
                throw th;
            }
        } else {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + longValue);
        }
    }
}
