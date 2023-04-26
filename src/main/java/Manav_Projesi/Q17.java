package Manav_Projesi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q17 {
    /*
    /* TASK :
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.

       */

    static Scanner scan = new Scanner(System.in);
    static List<String> urunler = new ArrayList<>(List.of("Elma", "Armut", "Havuc", "Kavun", "Portakal"));
    static List<Integer> fiyatlar = new ArrayList<>(List.of(5, 10, 30, 50, 100));

    static int urunFiyat = 0;
    static int toplamFiyat = 0;
    static int kilo = 0;
    static int secim = 0;

    public static void main(String[] args) {

        do {

            System.out.println("Gunuvar Manav'a Hoşgeldiniz...\n" +
                    "Almak istediğiniz ürünü seçin. \n1==>Elma\n2==>Armut\n3==>Havuc\n4==>Kavun\n5==>Portakal" +
                    "\n6==>Çıkış  ");
            secim = scan.nextInt();

            switch (secim) {
                case 1:
                    System.out.println("Kaç kilo almak istiyorsunuz?");
                    kilo = scan.nextInt();
                    urunFiyat = fiyatlar.get(0);
                    toplamFiyat += (urunFiyat * kilo);
                    break;
                case 2:
                    System.out.println("Kaç kilo almak istiyorsunuz?");
                    kilo = scan.nextInt();
                    urunFiyat = fiyatlar.get(1);
                    toplamFiyat += (urunFiyat * kilo);
                    break;
                case 3:
                    System.out.println("Kaç kilo almak istiyorsunuz?");
                    kilo = scan.nextInt();
                    urunFiyat = fiyatlar.get(2);
                    toplamFiyat += (urunFiyat * kilo);
                    break;
                case 4:
                    System.out.println("Kaç kilo almak istiyorsunuz?");
                    kilo = scan.nextInt();
                    urunFiyat = fiyatlar.get(3);
                    toplamFiyat += (urunFiyat * kilo);
                    break;
                case 5:
                    System.out.println("Kaç kilo almak istiyorsunuz?");
                    kilo = scan.nextInt();
                    urunFiyat = fiyatlar.get(4);
                    toplamFiyat += (urunFiyat * kilo);
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Yanlış seçim");
            }
        } while (secim != 6);

        System.out.println("toplam odemesi gereken tutar = " + toplamFiyat);

    }
}
