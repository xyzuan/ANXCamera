package com.google.firebase.iid;

import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.firebase:firebase-iid@@20.0.2 */
final class zzs {
    private final String zza;
    /* access modifiers changed from: private */
    public final long zzb;

    zzs(String str, long j) {
        this.zza = (String) Preconditions.checkNotNull(str);
        this.zzb = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzs)) {
            return false;
        }
        zzs zzs = (zzs) obj;
        return this.zzb == zzs.zzb && this.zza.equals(zzs.zza);
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, Long.valueOf(this.zzb));
    }

    /* access modifiers changed from: package-private */
    public final String zza() {
        return this.zza;
    }

    /* access modifiers changed from: package-private */
    public final long zzb() {
        return this.zzb;
    }
}
