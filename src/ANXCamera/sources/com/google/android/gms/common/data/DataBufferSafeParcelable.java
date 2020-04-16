package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.photos.api.PhotosOemApi;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class DataBufferSafeParcelable<T extends SafeParcelable> extends AbstractDataBuffer<T> {
    private static final String[] zalo = {PhotosOemApi.PATH_SPECIAL_TYPE_DATA};
    private final Parcelable.Creator<T> zalp;

    public DataBufferSafeParcelable(DataHolder dataHolder, Parcelable.Creator<T> creator) {
        super(dataHolder);
        this.zalp = creator;
    }

    public static <T extends SafeParcelable> void addValue(DataHolder.Builder builder, T t) {
        Parcel obtain = Parcel.obtain();
        t.writeToParcel(obtain, 0);
        ContentValues contentValues = new ContentValues();
        contentValues.put(PhotosOemApi.PATH_SPECIAL_TYPE_DATA, obtain.marshall());
        builder.withRow(contentValues);
        obtain.recycle();
    }

    public static DataHolder.Builder buildDataHolder() {
        return DataHolder.builder(zalo);
    }

    public T get(int i) {
        byte[] byteArray = this.mDataHolder.getByteArray(PhotosOemApi.PATH_SPECIAL_TYPE_DATA, i, this.mDataHolder.getWindowIndex(i));
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(byteArray, 0, byteArray.length);
        obtain.setDataPosition(0);
        T t = (SafeParcelable) this.zalp.createFromParcel(obtain);
        obtain.recycle();
        return t;
    }
}
