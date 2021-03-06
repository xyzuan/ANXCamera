package com.arcsoft.camera.utils;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.location.Location;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import com.android.camera.storage.Storage;
import com.ss.android.ugc.effectmanager.common.EffectConstants;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: MediaManager */
public class h {
    private static final String[] D = {"max(_id) as newId", "_data", "_size", "datetaken", a.f180e, "bucket_id", "mime_type", "date_modified", "media_type", "resolution", "tags", "width", "height", "orientation", "duration"};

    /* renamed from: a  reason: collision with root package name */
    public static final String f170a = e(t);

    /* renamed from: b  reason: collision with root package name */
    public static final Uri f171b = MediaStore.Files.getContentUri("external");

    /* renamed from: c  reason: collision with root package name */
    public static final int f172c = 1;

    /* renamed from: d  reason: collision with root package name */
    public static final int f173d = 3;

    /* renamed from: e  reason: collision with root package name */
    public static final int f174e = 0;

    /* renamed from: f  reason: collision with root package name */
    public static final int f175f = 1;
    public static final int g = 2;
    public static final int h = 3;
    public static final int i = 4;
    public static final int j = 5;
    public static final int k = 6;
    public static final int l = 7;
    public static final int m = 8;
    public static final int n = 9;
    public static final int o = 10;
    public static final int p = 11;
    public static final int q = 12;
    public static final int r = 13;
    public static final int s = 14;
    private static String t = (Environment.getExternalStorageDirectory().toString() + "/DCIM/WideSelfie/");
    private static h u = null;
    private final String A = "video/mp4";
    private final String[] B = {"_id", "bucket_id", "bucket_display_name", "_data", "_display_name", "width", "height", "_size", "mime_type", "datetaken", "date_modified", "date_added", "latitude", "longitude", "duration", "resolution"};
    private final String[] C = {"_id", "bucket_id", "bucket_display_name", "_data", "_display_name", "width", "height", "_size", "mime_type", "datetaken", "date_modified", "date_added", "latitude", "longitude", "orientation"};
    private Context v = null;
    private ContentResolver w = null;
    private final String x = Storage.MIME_JPEG;
    private final String y = "image/gif";
    private final String z = "video/3gpp";

    /* compiled from: MediaManager */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final String f176a = "_id";

        /* renamed from: b  reason: collision with root package name */
        public static final String f177b = "_data";

        /* renamed from: c  reason: collision with root package name */
        public static final String f178c = "_size";

        /* renamed from: d  reason: collision with root package name */
        public static final String f179d = "datetaken";

        /* renamed from: e  reason: collision with root package name */
        public static final String f180e = ("case media_type when 1 then \"" + MediaStore.Images.Media.EXTERNAL_CONTENT_URI + "\" else \"" + MediaStore.Video.Media.EXTERNAL_CONTENT_URI + "\" end");

        /* renamed from: f  reason: collision with root package name */
        public static final String f181f = "bucket_id";
        public static final String g = "mime_type";
        public static final String h = "date_modified";
        public static final String i = "latitude";
        public static final String j = "longitude";
        public static final String k = "orientation";
        public static final String l = "media_type";
        public static final String m = "duration";
        public static final String n = "resolution";
        public static final String o = "tags";
        public static final String p = "width";
        public static final String q = "height";
        public static final String r = "title";
        public static final String s = "_display_name";

        private a() {
        }
    }

    /* compiled from: MediaManager */
    public static class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public boolean f182a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public Uri f183b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public long f184c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public long f185d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public String f186e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public String f187f;
        /* access modifiers changed from: private */
        public String g;
        /* access modifiers changed from: private */
        public int h;
        /* access modifiers changed from: private */
        public int i;
        /* access modifiers changed from: private */
        public long j;
        /* access modifiers changed from: private */
        public String k;
        /* access modifiers changed from: private */
        public String l;
        /* access modifiers changed from: private */
        public String m;
        /* access modifiers changed from: private */
        public String n;
        /* access modifiers changed from: private */
        public double o;
        /* access modifiers changed from: private */
        public double p;
        /* access modifiers changed from: private */
        public int q;
        /* access modifiers changed from: private */
        public long r;
        /* access modifiers changed from: private */
        public String s;
    }

    private h(Context context) {
        this.v = context;
        this.w = this.v.getContentResolver();
    }

    public static Cursor a(ContentResolver contentResolver) {
        return contentResolver.query(f171b, D, "(media_type=? or media_type=?) and bucket_id=? ", new String[]{String.valueOf(1), String.valueOf(3), f170a}, "_id DESC");
    }

    private static Uri a(Cursor cursor) {
        return ContentUris.withAppendedId(Uri.parse(cursor.getString(4)), cursor.getLong(0));
    }

    private b a(Cursor cursor, boolean z2) {
        Cursor cursor2 = cursor;
        boolean z3 = z2;
        if (cursor2 == null || cursor.getCount() <= 0) {
            return null;
        }
        b bVar = new b();
        boolean unused = bVar.f182a = z3;
        Object obj = "longitude";
        Object obj2 = "latitude";
        if (z3) {
            long unused2 = bVar.f184c = cursor2.getLong(e.b(this.B, "_id"));
            Uri unused3 = bVar.f183b = ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, bVar.f184c);
            long unused4 = bVar.f185d = (long) cursor2.getInt(e.b(this.B, "bucket_id"));
            String unused5 = bVar.f186e = cursor2.getString(e.b(this.B, "bucket_display_name"));
            String unused6 = bVar.f187f = cursor2.getString(e.b(this.B, "_data"));
            String unused7 = bVar.g = cursor2.getString(e.b(this.B, "_display_name"));
            int unused8 = bVar.h = cursor2.getInt(e.b(this.B, "width"));
            int unused9 = bVar.i = cursor2.getInt(e.b(this.B, "height"));
            long unused10 = bVar.j = cursor2.getLong(e.b(this.B, "_size"));
            String unused11 = bVar.k = cursor2.getString(e.b(this.B, "mime_type"));
            String unused12 = bVar.l = cursor2.getString(e.b(this.B, "datetaken"));
            String unused13 = bVar.m = cursor2.getString(e.b(this.B, "date_modified"));
            String unused14 = bVar.n = cursor2.getString(e.b(this.B, "date_added"));
            double unused15 = bVar.o = cursor2.getDouble(e.b(this.B, obj2));
            double unused16 = bVar.p = cursor2.getDouble(e.b(this.B, obj));
            long unused17 = bVar.r = cursor2.getLong(e.b(this.B, "duration"));
            String unused18 = bVar.s = cursor2.getString(e.b(this.B, "resolution"));
        } else {
            long unused19 = bVar.f184c = cursor2.getLong(e.b(this.C, "_id"));
            Uri unused20 = bVar.f183b = ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, bVar.f184c);
            long unused21 = bVar.f185d = (long) cursor2.getInt(e.b(this.C, "bucket_id"));
            String unused22 = bVar.f186e = cursor2.getString(e.b(this.C, "bucket_display_name"));
            String unused23 = bVar.f187f = cursor2.getString(e.b(this.C, "_data"));
            String unused24 = bVar.g = cursor2.getString(e.b(this.C, "_display_name"));
            int unused25 = bVar.h = cursor2.getInt(e.b(this.C, "width"));
            int unused26 = bVar.i = cursor2.getInt(e.b(this.C, "height"));
            long unused27 = bVar.j = cursor2.getLong(e.b(this.C, "_size"));
            String unused28 = bVar.k = cursor2.getString(e.b(this.C, "mime_type"));
            String unused29 = bVar.l = cursor2.getString(e.b(this.C, "datetaken"));
            String unused30 = bVar.m = cursor2.getString(e.b(this.C, "date_modified"));
            String unused31 = bVar.n = cursor2.getString(e.b(this.C, "date_added"));
            double unused32 = bVar.o = cursor2.getDouble(e.b(this.C, obj2));
            double unused33 = bVar.p = cursor2.getDouble(e.b(this.C, obj));
            int unused34 = bVar.q = cursor2.getInt(e.b(this.C, "orientation"));
        }
        return bVar;
    }

    public static h a(Context context) {
        if (u == null) {
            synchronized (h.class) {
                if (u == null) {
                    u = new h(context);
                }
            }
        }
        return u;
    }

    private String d(String str) {
        String substring = str.substring(str.lastIndexOf(46));
        return (Storage.JPEG_SUFFIX.equalsIgnoreCase(substring) || ".jpeg".equalsIgnoreCase(substring)) ? Storage.MIME_JPEG : EffectConstants.GIF_FILE_SUFFIX.equalsIgnoreCase(substring) ? "image/gif" : (".3gp".equalsIgnoreCase(substring) || ".3gpp".equalsIgnoreCase(substring)) ? "video/3gpp" : ".mp4".equalsIgnoreCase(substring) ? "video/mp4" : "";
    }

    private static String e(String str) {
        return String.valueOf(str.substring(0, str.lastIndexOf("/")).toLowerCase().hashCode());
    }

    public Bitmap a(String str, float f2) {
        if (str == null) {
            str = a();
        }
        if (str == null) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = false;
        int i2 = (int) (((float) options.outHeight) / f2);
        if (i2 <= 0) {
            i2 = 1;
        }
        options.inSampleSize = i2;
        return BitmapFactory.decodeFile(str, options);
    }

    public Bitmap a(String str, BitmapFactory.Options options) {
        b a2 = a(str);
        if (a2 == null) {
            int i2 = 20;
            while (i2 > 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                }
                b a3 = a(str);
                if (a3 != null) {
                    a2 = a3;
                } else {
                    i2--;
                }
            }
            return null;
        }
        return a2.f182a ? MediaStore.Video.Thumbnails.getThumbnail(this.w, a2.f184c, 3, options) : MediaStore.Images.Thumbnails.getThumbnail(this.w, a2.f184c, 3, options);
    }

    public Uri a(String str, int i2, int i3) {
        return a(str, i2, i3, (Location) null, 0);
    }

    public Uri a(String str, int i2, int i3, int i4) {
        return a(str, i2, i3, (Location) null, i4);
    }

    public Uri a(String str, int i2, int i3, Location location) {
        return a(str, i2, i3, location, 0);
    }

    public Uri a(String str, int i2, int i3, Location location, int i4) {
        a.isVideoFile(str);
        String d2 = d(str);
        File file = new File(str);
        String name = file.getName();
        String substring = name.substring(0, name.lastIndexOf("."));
        ContentValues contentValues = new ContentValues();
        contentValues.put("_data", file.getPath());
        contentValues.put("_display_name", name);
        contentValues.put("title", substring);
        contentValues.put("width", Integer.valueOf(i2));
        contentValues.put("height", Integer.valueOf(i3));
        contentValues.put("_size", Long.valueOf(file.length()));
        contentValues.put("mime_type", d2);
        contentValues.put("datetaken", Long.valueOf(System.currentTimeMillis()));
        if (location != null) {
            contentValues.put("latitude", Double.valueOf(location.getLatitude()));
            contentValues.put("longitude", Double.valueOf(location.getLongitude()));
        }
        contentValues.put("orientation", Integer.valueOf(i4));
        Uri insert = this.w.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
        if (Build.VERSION.SDK_INT >= 14) {
            this.v.sendBroadcast(new Intent("android.hardware.action.NEW_PICTURE", insert));
        }
        return insert;
    }

    public b a(String str) {
        Cursor cursor;
        b bVar = null;
        if (str == null) {
            return null;
        }
        boolean isVideoFile = a.isVideoFile(str);
        if (isVideoFile) {
            cursor = this.w.query(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, this.B, "_data=?", new String[]{str}, "_id DESC");
        } else {
            cursor = this.w.query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, this.C, "_data=?", new String[]{str}, "_id DESC");
        }
        if (cursor != null && cursor.getCount() > 0) {
            cursor.moveToFirst();
            bVar = a(cursor, isVideoFile);
        }
        if (cursor != null) {
            cursor.close();
        }
        return bVar;
    }

    public String a() {
        String str;
        Cursor a2 = a(this.w);
        if (a2 == null || a2.getCount() <= 0) {
            str = null;
        } else {
            a2.moveToFirst();
            str = a2.getString(1);
        }
        if (a2 != null) {
            a2.close();
        }
        return str;
    }

    public List<b> a(String str, boolean z2) {
        Cursor cursor;
        if (str == null) {
            return Collections.emptyList();
        }
        if (str.endsWith(File.separator)) {
            str = str.substring(0, str.length() - 1);
        }
        int lastIndexOf = str.lastIndexOf(File.separator);
        if (-1 != lastIndexOf) {
            str = str.substring(lastIndexOf + 1);
        }
        if (z2) {
            cursor = this.w.query(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, this.B, "bucket_display_name=?", new String[]{str}, "_id ASC");
        } else {
            cursor = this.w.query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, this.C, "bucket_display_name=?", new String[]{str}, "_id ASC");
        }
        ArrayList arrayList = null;
        if (cursor != null && cursor.getCount() > 0) {
            arrayList = new ArrayList();
            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                arrayList.add(a(cursor, z2));
                cursor.moveToNext();
            }
        }
        if (cursor != null) {
            cursor.close();
        }
        return arrayList;
    }

    public boolean a(String str, String str2) {
        String str3;
        b a2 = a(str);
        if (a2 == null) {
            return false;
        }
        int lastIndexOf = str2.lastIndexOf(File.separator);
        if (-1 != lastIndexOf) {
            str2 = str2.substring(lastIndexOf + 1);
        }
        int lastIndexOf2 = str2.lastIndexOf(".");
        if (-1 != lastIndexOf2) {
            String str4 = str2;
            str2 = str2.substring(0, lastIndexOf2);
            str3 = str4;
        } else {
            str3 = str2 + "." + a.getExtension(str);
        }
        ContentValues contentValues = new ContentValues();
        if (a2.f182a) {
            contentValues.put("_display_name", str3);
            contentValues.put("title", str2);
        } else {
            contentValues.put("_display_name", str3);
            contentValues.put("title", str2);
        }
        return this.w.update(a2.f183b, contentValues, (String) null, (String[]) null) > 0;
    }

    public Uri b() {
        Uri uri;
        Cursor a2 = a(this.w);
        if (a2 == null || a2.getCount() <= 0) {
            uri = null;
        } else {
            a2.moveToFirst();
            uri = a(a2);
        }
        if (a2 != null) {
            a2.close();
        }
        return uri;
    }

    public boolean b(String str) {
        b a2 = a(str);
        return a2 != null && this.w.delete(a2.f183b, (String) null, (String[]) null) > 0;
    }

    public int c(String str) {
        try {
            int attributeInt = new ExifInterface(str).getAttributeInt("Orientation", 1);
            if (attributeInt == 3) {
                return 180;
            }
            if (attributeInt != 6) {
                return attributeInt != 8 ? 0 : 270;
            }
            return 90;
        } catch (IOException e2) {
            e2.printStackTrace();
            return 0;
        }
    }
}
