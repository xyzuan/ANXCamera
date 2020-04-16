package com.google.android.gms.measurement.internal;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
final class zzld extends SSLSocketFactory {
    private final SSLSocketFactory zza;

    zzld() {
        this(HttpsURLConnection.getDefaultSSLSocketFactory());
    }

    private zzld(SSLSocketFactory sSLSocketFactory) {
        this.zza = sSLSocketFactory;
    }

    private final SSLSocket zza(SSLSocket sSLSocket) {
        return new zzlc(this, sSLSocket);
    }

    public final Socket createSocket() throws IOException {
        return zza((SSLSocket) this.zza.createSocket());
    }

    public final Socket createSocket(String str, int i) throws IOException {
        return zza((SSLSocket) this.zza.createSocket(str, i));
    }

    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        return zza((SSLSocket) this.zza.createSocket(str, i, inetAddress, i2));
    }

    public final Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return zza((SSLSocket) this.zza.createSocket(inetAddress, i));
    }

    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return zza((SSLSocket) this.zza.createSocket(inetAddress, i, inetAddress2, i2));
    }

    public final Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        return zza((SSLSocket) this.zza.createSocket(socket, str, i, z));
    }

    public final String[] getDefaultCipherSuites() {
        return this.zza.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        return this.zza.getSupportedCipherSuites();
    }
}
