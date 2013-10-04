package p1.sesi4;

import java.util.Random;

public class DemoLooping2 {
    static boolean selesai = false;

    public static void main(String[] x){
        
        Integer faktor = 7;
        System.out.println("Mencari kelipatan "+faktor+" dengan while");
        while(!selesai){
            cariKelipatan(faktor);
        }
        System.out.println("Selesai mencari kelipatan dengan while");

        System.out.println("Mencari kelipatan "+faktor+" dengan for");
        for(selesai = false; !selesai;){
            cariKelipatan(faktor);
        }
        System.out.println("Selesai mencari kelipatan dengan for");
    }

    public static void cariKelipatan(Integer faktor){
        Integer random = new Random().nextInt();
        System.out.println("Bilangan random : "+random);

        if(random % faktor == 0){
            System.out.println("Kelipatan "+faktor+" ditemukan, yaitu : "+random);
            selesai = true;
        }
    }
}
