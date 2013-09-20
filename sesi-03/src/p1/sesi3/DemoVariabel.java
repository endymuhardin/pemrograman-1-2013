package p1.sesi3;

public class DemoVariabel {
    public static void main(String[] q){
        int x = 10;
        System.out.println("X : "+x);

        char z = 'a';
        System.out.println("Z : "+z);
        
        // isi data ke tipe yang tidak tepat
        int y = z;
        System.out.println("Y : "+y); // hasilnya jadi 'aneh'

        // tidak bisa compile (error)
        //char w = x;
        //System.out.println("W : "+w);

        // type casting
        v = (char)x;
        System.out.println("V : "+v);
        System.out.println("Baris selanjutnya");

        coba();

        System.out.println("Setelah menjalankan coba");
    }

    static char v;

    public static void coba(){
        System.out.println("V : "+v);

        short d = 15;
        System.out.println("D : "+d);
    }
}




