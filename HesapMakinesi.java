import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {

        System.out.println("1. Toplama\n" +
                "2. Çıkarma\n" +
                "3. Çarpma\n" +
                "4. Bölme");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Yapacağınız işlemi seçin: ");
        int a = scanner.nextInt();

        switch (a) {
            case 1:
                System.out.print("İlk sayıyı girin: ");
                int ilkSayi = scanner.nextInt();
                System.out.print("İkinci sayıyı girin: ");
                int ikinciSayi = scanner.nextInt();
                System.out.print("Toplam: " + (ilkSayi + ikinciSayi));
                break;

            case 2:
                System.out.print("İlk sayıyı girin: ");
                int ilkSayiCikartma = scanner.nextInt();
                System.out.print("İkinci sayıyı girin: ");
                int ikinciSayiCikartma = scanner.nextInt();
                System.out.print("Kalan: " + (ilkSayiCikartma - ikinciSayiCikartma));
                break;

            case 3:
                System.out.print("İlk sayıyı girin: ");
                int ilkSayiCarpma = scanner.nextInt();
                System.out.print("İkinci sayıyı girin: ");
                int ikinciSayiCarpma = scanner.nextInt();
                System.out.print("Toplam: " + (ilkSayiCarpma * ikinciSayiCarpma));
                break;

            case 4:
                System.out.print("İlk sayıyı girin: ");
                int ilkSayiBolme = scanner.nextInt();
                System.out.print("İkinci sayıyı girin: ");
                int ikinciSayiBolme = scanner.nextInt();
                System.out.print("Toplam: " + (ilkSayiBolme / ikinciSayiBolme));
                break;
            default:
                System.out.println("Lütfen yapmak istediğiniz işlemi seçin.");
        }
    }
}
