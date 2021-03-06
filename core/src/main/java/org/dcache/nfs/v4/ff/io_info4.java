/*
 * Automatically generated by jrpcgen 1.0.7+ on 1/8/15 2:35 PM
 * jrpcgen is part of the "Remote Tea" ONC/RPC package for Java
 * See http://remotetea.sourceforge.net for details
 *
 * This version of jrpcgen adopted by dCache project
 * See http://www.dCache.ORG for details
 */
package org.dcache.nfs.v4.ff;
import org.dcache.xdr.*;
import java.io.IOException;
import org.dcache.nfs.v4.xdr.uint32_t;
import org.dcache.nfs.v4.xdr.uint64_t;

public class io_info4 implements XdrAble, java.io.Serializable {
    public uint32_t ii_count;
    public uint64_t ii_bytes;

    private static final long serialVersionUID = 7002990356778538437L;

    public io_info4() {
    }

    public io_info4(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        xdrDecode(xdr);
    }

    public void xdrEncode(XdrEncodingStream xdr)
           throws OncRpcException, IOException {
        ii_count.xdrEncode(xdr);
        ii_bytes.xdrEncode(xdr);
    }

    public void xdrDecode(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        ii_count = new uint32_t(xdr);
        ii_bytes = new uint64_t(xdr);
    }

}
// End of io_info4.java
