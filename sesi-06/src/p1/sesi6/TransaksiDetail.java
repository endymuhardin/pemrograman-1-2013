package p1.sesi6;

import java.math.BigDecimal;

public class TransaksiDetail {
    private Barang barang;
    private Integer jumlah;
    
    public BigDecimal subtotal(){
        return barang.getHarga().multiply(new BigDecimal(jumlah));
    }
}
