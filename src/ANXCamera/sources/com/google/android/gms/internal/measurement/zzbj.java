package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzfd;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
public final class zzbj {

    /* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
    public static final class zza extends zzfd<zza, C0022zza> implements zzgq {
        /* access modifiers changed from: private */
        public static final zza zzi;
        private static volatile zzgx<zza> zzj;
        private int zzc;
        private int zzd;
        private zzfl<zze> zze = zzbq();
        private zzfl<zzb> zzf = zzbq();
        private boolean zzg;
        private boolean zzh;

        /* renamed from: com.google.android.gms.internal.measurement.zzbj$zza$zza  reason: collision with other inner class name */
        /* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
        public static final class C0022zza extends zzfd.zzb<zza, C0022zza> implements zzgq {
            private C0022zza() {
                super(zza.zzi);
            }

            /* synthetic */ C0022zza(zzbk zzbk) {
                this();
            }

            public final int zza() {
                return ((zza) this.zza).zzd();
            }

            public final C0022zza zza(int i, zzb.zza zza) {
                if (this.zzb) {
                    zzq();
                    this.zzb = false;
                }
                ((zza) this.zza).zza(i, (zzb) ((zzfd) zza.zzu()));
                return this;
            }

            public final C0022zza zza(int i, zze.zza zza) {
                if (this.zzb) {
                    zzq();
                    this.zzb = false;
                }
                ((zza) this.zza).zza(i, (zze) ((zzfd) zza.zzu()));
                return this;
            }

            public final zze zza(int i) {
                return ((zza) this.zza).zza(i);
            }

            public final int zzb() {
                return ((zza) this.zza).zzf();
            }

            public final zzb zzb(int i) {
                return ((zza) this.zza).zzb(i);
            }
        }

        static {
            zza zza = new zza();
            zzi = zza;
            zzfd.zza(zza.class, zza);
        }

        private zza() {
        }

        /* access modifiers changed from: private */
        public final void zza(int i, zzb zzb) {
            zzb.getClass();
            if (!this.zzf.zza()) {
                this.zzf = zzfd.zza(this.zzf);
            }
            this.zzf.set(i, zzb);
        }

        /* access modifiers changed from: private */
        public final void zza(int i, zze zze2) {
            zze2.getClass();
            if (!this.zze.zza()) {
                this.zze = zzfd.zza(this.zze);
            }
            this.zze.set(i, zze2);
        }

        public final zze zza(int i) {
            return (zze) this.zze.get(i);
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzbk.zza[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0022zza((zzbk) null);
                case 3:
                    return zza((zzgo) zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001\u0004\u0000\u0002\u001b\u0003\u001b\u0004\u0007\u0001\u0005\u0007\u0002", new Object[]{"zzc", "zzd", "zze", zze.class, "zzf", zzb.class, "zzg", "zzh"});
                case 4:
                    return zzi;
                case 5:
                    zzgx<zza> zzgx = zzj;
                    if (zzgx == null) {
                        synchronized (zza.class) {
                            zzgx = zzj;
                            if (zzgx == null) {
                                zzgx = new zzfd.zza<>(zzi);
                                zzj = zzgx;
                            }
                        }
                    }
                    return zzgx;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final boolean zza() {
            return (this.zzc & 1) != 0;
        }

        public final int zzb() {
            return this.zzd;
        }

        public final zzb zzb(int i) {
            return (zzb) this.zzf.get(i);
        }

        public final List<zze> zzc() {
            return this.zze;
        }

        public final int zzd() {
            return this.zze.size();
        }

        public final List<zzb> zze() {
            return this.zzf;
        }

        public final int zzf() {
            return this.zzf.size();
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
    public static final class zzb extends zzfd<zzb, zza> implements zzgq {
        /* access modifiers changed from: private */
        public static final zzb zzl;
        private static volatile zzgx<zzb> zzm;
        private int zzc;
        private int zzd;
        private String zze = "";
        private zzfl<zzc> zzf = zzbq();
        private boolean zzg;
        private zzd zzh;
        private boolean zzi;
        private boolean zzj;
        private boolean zzk;

        /* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
        public static final class zza extends zzfd.zzb<zzb, zza> implements zzgq {
            private zza() {
                super(zzb.zzl);
            }

            /* synthetic */ zza(zzbk zzbk) {
                this();
            }

            public final zza zza(int i, zzc zzc) {
                if (this.zzb) {
                    zzq();
                    this.zzb = false;
                }
                ((zzb) this.zza).zza(i, zzc);
                return this;
            }

            public final zza zza(String str) {
                if (this.zzb) {
                    zzq();
                    this.zzb = false;
                }
                ((zzb) this.zza).zza(str);
                return this;
            }

            public final zzc zza(int i) {
                return ((zzb) this.zza).zza(i);
            }

            public final String zza() {
                return ((zzb) this.zza).zzc();
            }

            public final int zzb() {
                return ((zzb) this.zza).zze();
            }
        }

        static {
            zzb zzb = new zzb();
            zzl = zzb;
            zzfd.zza(zzb.class, zzb);
        }

        private zzb() {
        }

        /* access modifiers changed from: private */
        public final void zza(int i, zzc zzc2) {
            zzc2.getClass();
            if (!this.zzf.zza()) {
                this.zzf = zzfd.zza(this.zzf);
            }
            this.zzf.set(i, zzc2);
        }

        /* access modifiers changed from: private */
        public final void zza(String str) {
            str.getClass();
            this.zzc |= 2;
            this.zze = str;
        }

        public static zza zzl() {
            return (zza) zzl.zzbk();
        }

        public final zzc zza(int i) {
            return (zzc) this.zzf.get(i);
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzbk.zza[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza((zzbk) null);
                case 3:
                    return zza((zzgo) zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\u001b\u0004\u0007\u0002\u0005\t\u0003\u0006\u0007\u0004\u0007\u0007\u0005\b\u0007\u0006", new Object[]{"zzc", "zzd", "zze", "zzf", zzc.class, "zzg", "zzh", "zzi", "zzj", "zzk"});
                case 4:
                    return zzl;
                case 5:
                    zzgx<zzb> zzgx = zzm;
                    if (zzgx == null) {
                        synchronized (zzb.class) {
                            zzgx = zzm;
                            if (zzgx == null) {
                                zzgx = new zzfd.zza<>(zzl);
                                zzm = zzgx;
                            }
                        }
                    }
                    return zzgx;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final boolean zza() {
            return (this.zzc & 1) != 0;
        }

        public final int zzb() {
            return this.zzd;
        }

        public final String zzc() {
            return this.zze;
        }

        public final List<zzc> zzd() {
            return this.zzf;
        }

        public final int zze() {
            return this.zzf.size();
        }

        public final boolean zzf() {
            return (this.zzc & 8) != 0;
        }

        public final zzd zzg() {
            zzd zzd2 = this.zzh;
            return zzd2 == null ? zzd.zzk() : zzd2;
        }

        public final boolean zzh() {
            return this.zzi;
        }

        public final boolean zzi() {
            return this.zzj;
        }

        public final boolean zzj() {
            return (this.zzc & 64) != 0;
        }

        public final boolean zzk() {
            return this.zzk;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
    public static final class zzc extends zzfd<zzc, zza> implements zzgq {
        /* access modifiers changed from: private */
        public static final zzc zzh;
        private static volatile zzgx<zzc> zzi;
        private int zzc;
        private zzf zzd;
        private zzd zze;
        private boolean zzf;
        private String zzg = "";

        /* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
        public static final class zza extends zzfd.zzb<zzc, zza> implements zzgq {
            private zza() {
                super(zzc.zzh);
            }

            /* synthetic */ zza(zzbk zzbk) {
                this();
            }

            public final zza zza(String str) {
                if (this.zzb) {
                    zzq();
                    this.zzb = false;
                }
                ((zzc) this.zza).zza(str);
                return this;
            }
        }

        static {
            zzc zzc2 = new zzc();
            zzh = zzc2;
            zzfd.zza(zzc.class, zzc2);
        }

        private zzc() {
        }

        /* access modifiers changed from: private */
        public final void zza(String str) {
            str.getClass();
            this.zzc |= 8;
            this.zzg = str;
        }

        public static zzc zzi() {
            return zzh;
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzbk.zza[i - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza((zzbk) null);
                case 3:
                    return zza((zzgo) zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\u0007\u0002\u0004\b\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
                case 4:
                    return zzh;
                case 5:
                    zzgx<zzc> zzgx = zzi;
                    if (zzgx == null) {
                        synchronized (zzc.class) {
                            zzgx = zzi;
                            if (zzgx == null) {
                                zzgx = new zzfd.zza<>(zzh);
                                zzi = zzgx;
                            }
                        }
                    }
                    return zzgx;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final boolean zza() {
            return (this.zzc & 1) != 0;
        }

        public final zzf zzb() {
            zzf zzf2 = this.zzd;
            return zzf2 == null ? zzf.zzi() : zzf2;
        }

        public final boolean zzc() {
            return (this.zzc & 2) != 0;
        }

        public final zzd zzd() {
            zzd zzd2 = this.zze;
            return zzd2 == null ? zzd.zzk() : zzd2;
        }

        public final boolean zze() {
            return (this.zzc & 4) != 0;
        }

        public final boolean zzf() {
            return this.zzf;
        }

        public final boolean zzg() {
            return (this.zzc & 8) != 0;
        }

        public final String zzh() {
            return this.zzg;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
    public static final class zzd extends zzfd<zzd, zzb> implements zzgq {
        /* access modifiers changed from: private */
        public static final zzd zzi;
        private static volatile zzgx<zzd> zzj;
        private int zzc;
        private int zzd;
        private boolean zze;
        private String zzf = "";
        private String zzg = "";
        private String zzh = "";

        /* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
        public enum zza implements zzfi {
            UNKNOWN_COMPARISON_TYPE(0),
            LESS_THAN(1),
            GREATER_THAN(2),
            EQUAL(3),
            BETWEEN(4);
            
            private static final zzfh<zza> zzf = null;
            private final int zzg;

            static {
                zzf = new zzbm();
            }

            private zza(int i) {
                this.zzg = i;
            }

            public static zza zza(int i) {
                if (i == 0) {
                    return UNKNOWN_COMPARISON_TYPE;
                }
                if (i == 1) {
                    return LESS_THAN;
                }
                if (i == 2) {
                    return GREATER_THAN;
                }
                if (i == 3) {
                    return EQUAL;
                }
                if (i != 4) {
                    return null;
                }
                return BETWEEN;
            }

            public static zzfk zzb() {
                return zzbl.zza;
            }

            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzg + " name=" + name() + '>';
            }

            public final int zza() {
                return this.zzg;
            }
        }

        /* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
        public static final class zzb extends zzfd.zzb<zzd, zzb> implements zzgq {
            private zzb() {
                super(zzd.zzi);
            }

            /* synthetic */ zzb(zzbk zzbk) {
                this();
            }
        }

        static {
            zzd zzd2 = new zzd();
            zzi = zzd2;
            zzfd.zza(zzd.class, zzd2);
        }

        private zzd() {
        }

        public static zzd zzk() {
            return zzi;
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzbk.zza[i - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zzb((zzbk) null);
                case 3:
                    return zza((zzgo) zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0000\u0002\u0007\u0001\u0003\b\u0002\u0004\b\u0003\u0005\b\u0004", new Object[]{"zzc", "zzd", zza.zzb(), "zze", "zzf", "zzg", "zzh"});
                case 4:
                    return zzi;
                case 5:
                    zzgx<zzd> zzgx = zzj;
                    if (zzgx == null) {
                        synchronized (zzd.class) {
                            zzgx = zzj;
                            if (zzgx == null) {
                                zzgx = new zzfd.zza<>(zzi);
                                zzj = zzgx;
                            }
                        }
                    }
                    return zzgx;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final boolean zza() {
            return (this.zzc & 1) != 0;
        }

        public final zza zzb() {
            zza zza2 = zza.zza(this.zzd);
            return zza2 == null ? zza.UNKNOWN_COMPARISON_TYPE : zza2;
        }

        public final boolean zzc() {
            return (this.zzc & 2) != 0;
        }

        public final boolean zzd() {
            return this.zze;
        }

        public final boolean zze() {
            return (this.zzc & 4) != 0;
        }

        public final String zzf() {
            return this.zzf;
        }

        public final boolean zzg() {
            return (this.zzc & 8) != 0;
        }

        public final String zzh() {
            return this.zzg;
        }

        public final boolean zzi() {
            return (this.zzc & 16) != 0;
        }

        public final String zzj() {
            return this.zzh;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
    public static final class zze extends zzfd<zze, zza> implements zzgq {
        /* access modifiers changed from: private */
        public static final zze zzj;
        private static volatile zzgx<zze> zzk;
        private int zzc;
        private int zzd;
        private String zze = "";
        private zzc zzf;
        private boolean zzg;
        private boolean zzh;
        private boolean zzi;

        /* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
        public static final class zza extends zzfd.zzb<zze, zza> implements zzgq {
            private zza() {
                super(zze.zzj);
            }

            /* synthetic */ zza(zzbk zzbk) {
                this();
            }

            public final zza zza(String str) {
                if (this.zzb) {
                    zzq();
                    this.zzb = false;
                }
                ((zze) this.zza).zza(str);
                return this;
            }
        }

        static {
            zze zze2 = new zze();
            zzj = zze2;
            zzfd.zza(zze.class, zze2);
        }

        private zze() {
        }

        /* access modifiers changed from: private */
        public final void zza(String str) {
            str.getClass();
            this.zzc |= 2;
            this.zze = str;
        }

        public static zza zzi() {
            return (zza) zzj.zzbk();
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzbk.zza[i - 1]) {
                case 1:
                    return new zze();
                case 2:
                    return new zza((zzbk) null);
                case 3:
                    return zza((zzgo) zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\t\u0002\u0004\u0007\u0003\u0005\u0007\u0004\u0006\u0007\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
                case 4:
                    return zzj;
                case 5:
                    zzgx<zze> zzgx = zzk;
                    if (zzgx == null) {
                        synchronized (zze.class) {
                            zzgx = zzk;
                            if (zzgx == null) {
                                zzgx = new zzfd.zza<>(zzj);
                                zzk = zzgx;
                            }
                        }
                    }
                    return zzgx;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final boolean zza() {
            return (this.zzc & 1) != 0;
        }

        public final int zzb() {
            return this.zzd;
        }

        public final String zzc() {
            return this.zze;
        }

        public final zzc zzd() {
            zzc zzc2 = this.zzf;
            return zzc2 == null ? zzc.zzi() : zzc2;
        }

        public final boolean zze() {
            return this.zzg;
        }

        public final boolean zzf() {
            return this.zzh;
        }

        public final boolean zzg() {
            return (this.zzc & 32) != 0;
        }

        public final boolean zzh() {
            return this.zzi;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
    public static final class zzf extends zzfd<zzf, zza> implements zzgq {
        /* access modifiers changed from: private */
        public static final zzf zzh;
        private static volatile zzgx<zzf> zzi;
        private int zzc;
        private int zzd;
        private String zze = "";
        private boolean zzf;
        private zzfl<String> zzg = zzfd.zzbq();

        /* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
        public static final class zza extends zzfd.zzb<zzf, zza> implements zzgq {
            private zza() {
                super(zzf.zzh);
            }

            /* synthetic */ zza(zzbk zzbk) {
                this();
            }
        }

        /* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
        public enum zzb implements zzfi {
            UNKNOWN_MATCH_TYPE(0),
            REGEXP(1),
            BEGINS_WITH(2),
            ENDS_WITH(3),
            PARTIAL(4),
            EXACT(5),
            IN_LIST(6);
            
            private static final zzfh<zzb> zzh = null;
            private final int zzi;

            static {
                zzh = new zzbn();
            }

            private zzb(int i) {
                this.zzi = i;
            }

            public static zzb zza(int i) {
                switch (i) {
                    case 0:
                        return UNKNOWN_MATCH_TYPE;
                    case 1:
                        return REGEXP;
                    case 2:
                        return BEGINS_WITH;
                    case 3:
                        return ENDS_WITH;
                    case 4:
                        return PARTIAL;
                    case 5:
                        return EXACT;
                    case 6:
                        return IN_LIST;
                    default:
                        return null;
                }
            }

            public static zzfk zzb() {
                return zzbp.zza;
            }

            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzi + " name=" + name() + '>';
            }

            public final int zza() {
                return this.zzi;
            }
        }

        static {
            zzf zzf2 = new zzf();
            zzh = zzf2;
            zzfd.zza(zzf.class, zzf2);
        }

        private zzf() {
        }

        public static zzf zzi() {
            return zzh;
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzbk.zza[i - 1]) {
                case 1:
                    return new zzf();
                case 2:
                    return new zza((zzbk) null);
                case 3:
                    return zza((zzgo) zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\f\u0000\u0002\b\u0001\u0003\u0007\u0002\u0004\u001a", new Object[]{"zzc", "zzd", zzb.zzb(), "zze", "zzf", "zzg"});
                case 4:
                    return zzh;
                case 5:
                    zzgx<zzf> zzgx = zzi;
                    if (zzgx == null) {
                        synchronized (zzf.class) {
                            zzgx = zzi;
                            if (zzgx == null) {
                                zzgx = new zzfd.zza<>(zzh);
                                zzi = zzgx;
                            }
                        }
                    }
                    return zzgx;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final boolean zza() {
            return (this.zzc & 1) != 0;
        }

        public final zzb zzb() {
            zzb zza2 = zzb.zza(this.zzd);
            return zza2 == null ? zzb.UNKNOWN_MATCH_TYPE : zza2;
        }

        public final boolean zzc() {
            return (this.zzc & 2) != 0;
        }

        public final String zzd() {
            return this.zze;
        }

        public final boolean zze() {
            return (this.zzc & 4) != 0;
        }

        public final boolean zzf() {
            return this.zzf;
        }

        public final List<String> zzg() {
            return this.zzg;
        }

        public final int zzh() {
            return this.zzg.size();
        }
    }
}
