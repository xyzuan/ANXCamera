package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class zzga {
    private final String zza;
    private final long zzb;
    private boolean zzc;
    private long zzd;
    private final /* synthetic */ zzfv zze;

    public zzga(zzfv zzfv, String str, long j) {
        this.zze = zzfv;
        Preconditions.checkNotEmpty(str);
        this.zza = str;
        this.zzb = j;
    }

    public final long zza() {
        if (!this.zzc) {
            this.zzc = true;
            this.zzd = this.zze.zzg().getLong(this.zza, this.zzb);
        }
        return this.zzd;
    }

    public final void zza(long j) {
        SharedPreferences.Editor edit = this.zze.zzg().edit();
        edit.putLong(this.zza, j);
        edit.apply();
        this.zzd = j;
    }
}
