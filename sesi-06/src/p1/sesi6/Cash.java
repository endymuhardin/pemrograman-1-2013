package p1.sesi6;

import java.math.BigDecimal;

public class Cash extends Pembayaran {
    private BigDecimal dibayar;
    private Transaksi transaksi;
    
    public BigDecimal getDibayar(){
        return dibayar;
    }
    
    public void setDibayar(BigDecimal x){
        dibayar = x;
    }
    
    public BigDecimal hitungKembalian(){
        return transaksi.hitungTagihan().subtract(dibayar);
    }
}
