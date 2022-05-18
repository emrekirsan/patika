import java.util.Scanner;

public class NotOrtalamasiHesaplama {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int matematik, fizik, turkce, edebiyat, tarih, muzik;

            // Veri alma

        System.out.println("Not Hesaplama Programı\n" +
                        "***************************");

        System.out.print("Matematik notunuzu girin: ");
        matematik = input.nextInt();

        System.out.print("Fizik notunuzu girin: ");
        fizik = input.nextInt();

        System.out.print("Fizik notunuzu girin: ");
        turkce = input.nextInt();

        System.out.print("Edebiyat notunuzu girin: ");
        edebiyat = input.nextInt();

        System.out.print("Tarih notunuzu girin: ");
        tarih = input.nextInt();

        System.out.print("Müzik notunuzu girin: ");
        muzik = input.nextInt();

            // Sonuç

        double toplam = matematik + fizik + turkce + edebiyat + tarih + muzik;
        double sonuc = toplam / 6;
        boolean kosul = sonuc >= 50;
        String gecerNot = kosul ? "\nSınıfı geçtiniz." : "\nSınıfta kaldınız.";

        System.out.println("Not ortalamanız: " + sonuc + gecerNot);

    }

}
