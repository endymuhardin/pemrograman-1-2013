package p1.sesi5;

public class DemoClassObject {
    public static void main(String[] x){
        Mahasiswa.jumlah = 0;
        // Mahasiswa.npm = "999"; // error, instance variabel harus ada objectnya dulu
        System.out.println("Jumlah mahasiswa : "+Mahasiswa.jumlah);

        Mahasiswa m1 = new Mahasiswa();
        m1.npm = "123";
        m1.nama = "endy";
        m1.jumlah = 1;

        Mahasiswa m2 = new Mahasiswa();
        m2.npm = "456";
        m2.nama = "budi";
        m2.jumlah = 2;
        
        tampilkanMahasiswa(m1);
        tampilkanMahasiswa(m2);
        System.out.println("Jumlah mahasiswa : "+Mahasiswa.jumlah);
        
    }

    public static void tampilkanMahasiswa(Mahasiswa m){
        System.out.println("NPM : "+m.npm);
        System.out.println("Nama : "+m.nama);
        System.out.println("Jumlah : "+m.jumlah);
    }
}
