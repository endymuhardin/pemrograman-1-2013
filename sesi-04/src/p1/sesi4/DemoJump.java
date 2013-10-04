package p1.sesi4;

import java.util.Random;

public class DemoJump {
    public static void main(String[] x){
        Integer faktor = 7;
        Integer jumlahFaktorDiinginkan = 4;
        Integer batasAtas = 1000000;

        System.out.println("Mencari kelipatan "+faktor+" dengan break & continue");

        Integer jumlahFaktorDitemukan = 0;
        while(true){
            Integer random = new Random().nextInt();
            System.out.println("Bilangan random : "+random);

            if(random > batasAtas){
                System.out.println("Melewati batas atas, langsung selesai");
                return;
            }

            if(random % faktor == 0){
                System.out.println("Kelipatan "+faktor+" ditemukan, yaitu : "+random);
                jumlahFaktorDitemukan++;

                if(jumlahFaktorDitemukan < jumlahFaktorDiinginkan){
                    System.out.println("Baru menemukan "+jumlahFaktorDitemukan+" faktor");
                    System.out.println("dari "+jumlahFaktorDiinginkan
                            +" yang diminta, lanjut lagi");
                    continue;
                } else {
                    System.out.println("Sudah menemukan "+jumlahFaktorDiinginkan
                            +", selesai looping");
                    break;
                }
            }
        }
        System.out.println("Selesai mencari kelipatan dengan break");
    }
}
