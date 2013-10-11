package p1.sesi5;

public class Dosen {
    String nama;
    String email;

    
    // begitu kita mendefinisikan constructor, 
    // Java tidak akan membuatkan default constructor
    public Dosen(String nama, String email){
        this.nama = nama;
        this.email = email;
    }

    // tidak otomatis dibuatkan oleh java
    // bila dibutuhkan, kita harus buat sendiri
    public Dosen(){}

    // method
    public void info(){
        System.out.println("Nama : "+nama);
        System.out.println("Email : "+email);
    }
}
