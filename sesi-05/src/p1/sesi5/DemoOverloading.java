package p1.sesi5;

public class DemoOverloading {
    public static void main(String[] x){
        Dosen d = new Dosen();
        d.info();

        d.nama = "endy";
        d.email = "endy.muhardin@gmail.com";
        d.info();
    }
}
