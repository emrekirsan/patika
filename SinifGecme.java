import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int matematik, fizik, turkce, kimya, muzik;
        double toplam = 0;
        int dersSayisi = 0;

        // input alma

        System.out.print("Matematik sınav notunuz: ");
        matematik = input.nextInt();
        if (matematik >= 0 && matematik <= 100) {
            dersSayisi++;
            toplam = toplam + matematik;
        }

        System.out.print("Fizik sınav notunuz: ");
        fizik = input.nextInt();
        if (fizik >= 0 && fizik <= 100) {
            dersSayisi++;
            toplam = toplam + fizik;
        }

        System.out.print("Türkçe sınav notunuz: ");
        turkce = input.nextInt();
        if (turkce >= 0 && turkce <= 100) {
            dersSayisi++;
            toplam = toplam + turkce;
        }

        System.out.print("Kimya sınav notunuz: ");
        kimya = input.nextInt();
        if (kimya >= 0 && kimya <= 100) {
            dersSayisi++;
            toplam = toplam + kimya;
        }

        System.out.print("Müzik sınav notunuz: ");
        muzik = input.nextInt();
        if (muzik >= 0 && muzik <= 100) {
            dersSayisi++;
            toplam = toplam + muzik;
        }

        // sonuç

        double ortalama = toplam / dersSayisi;

        if (ortalama < 55) {
            System.out.println("Aldığınız not: " + ortalama + "\nKALDINIZ...");
        }
        else {
            System.out.println("Aldığınız not: " + ortalama + "\nGEÇTİNİZ...");
        }
    }
}
