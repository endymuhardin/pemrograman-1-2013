package p1.sesi4;

public class DemoLooping{
    public static void main(String[] x){
        String[][] daftarNilai = new String[][]{
            new String[]{"001", "A"},
            new String[]{"002", "C"},
            new String[]{"003", "B"}
        };

        System.out.println("Looping menggunakan for");

        for(int i = 0; i<daftarNilai.length; i++){
            System.out.println("NPM : "+daftarNilai[i][0]);
            System.out.println("Nilai : "+daftarNilai[i][1]);
        }

        System.out.println("Selesai for");

        System.out.println("Looping menggunakan while");

        int ix = 0;
        while(ix<daftarNilai.length){
            System.out.println("NPM : "+daftarNilai[ix][0]);
            System.out.println("Nilai : "+daftarNilai[ix][1]);
            ix++;
        }

        System.out.println("Selesai while");
    }
}
