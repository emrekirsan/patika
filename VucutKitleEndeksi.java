import java.util.Scanner;

public class VucutKitleEndeksi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double boy, kilo;

        // input alma

        System.out.print("Lütfen boyunuzu metre cinsinden girin: ");
        boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu girin: ");
        kilo = input.nextDouble();

            // vke formülü

        double toplam = kilo / (boy*boy);

            // çıktı

        System.out.println(toplam);

    }
}
