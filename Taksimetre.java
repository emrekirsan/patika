import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

        int gidilenKm;
        double kmTutar = 2.20;

        System.out.print("Gidilecek km: ");
        gidilenKm = input.nextInt();

        double toplam = 10 + gidilenKm * kmTutar;
        toplam = (toplam < 20) ? 20 : toplam;

        System.out.println("Ödeyeceğiniz tutar: " + toplam);

    }
}
