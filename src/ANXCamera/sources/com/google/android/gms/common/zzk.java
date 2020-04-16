package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import javax.annotation.Nullable;

public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = new zzl();
    private final boolean zzaa;
    private final boolean zzab;
    private final String zzy;
    @Nullable
    private final zze zzz;

    zzk(String str, @Nullable IBinder iBinder, boolean z, boolean z2) {
        this.zzy = str;
        this.zzz = zza(iBinder);
        this.zzaa = z;
        this.zzab = z2;
    }

    zzk(String str, @Nullable zze zze, boolean z, boolean z2) {
        this.zzy = str;
        this.zzz = zze;
        this.zzaa = z;
        this.zzab = z2;
    }

    @Nullable
    private static zze zza(@Nullable IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        try {
            IObjectWrapper zzb = zzj.zzb(iBinder).zzb();
            byte[] bArr = zzb == null ? null : (byte[]) ObjectWrapper.unwrap(zzb);
            if (bArr != null) {
                return new zzf(bArr);
            }
            Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
            return null;
        } catch (RemoteException e2) {
            Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e2);
            return null;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zzy, false);
        zze zze = this.zzz;
        if (zze == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            iBinder = null;
        } else {
            iBinder = zze.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 2, iBinder, false);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzaa);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzab);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
