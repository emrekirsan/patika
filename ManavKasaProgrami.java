import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // fiyatlar
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5;

        // kg
        double armutKG, elmaKG, domatesKG, muzKG, patlicanKG;

        // input
        System.out.print("Kaç kilo armut aldınız? : ");
        armutKG = input.nextDouble();
        System.out.print("Kaç kilo elma aldınız? : ");
        elmaKG = input.nextDouble();
        System.out.print("Kaç kilo domates aldınız? : ");
        domatesKG = input.nextDouble();
        System.out.print("Kaç kilo muz aldınız? : ");
        muzKG = input.nextDouble();
        System.out.print("Kaç kilo patlıcan aldınız? : ");
        patlicanKG = input.nextDouble();

        // hesaplama
        double toplamKG = armutKG + elmaKG + domatesKG + muzKG + patlicanKG;
        double toplamFiyat = (armutKG*armut) + (elmaKG*elma) + (domatesKG*domates) + (muzKG*muz) + (patlicanKG*patlican);

        // çıktı
        System.out.println("Toplam aldınığınız KG: " + toplamKG);
        System.out.println("Toplam ödeyeceğiniz fiyat: " + toplamFiyat);

    }
}
