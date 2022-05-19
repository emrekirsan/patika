import java.util.Scanner;

public class DaireAlaniBulma {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double pi = 3.14;
        int yariCap;

        System.out.print("Lütfen dairenin yarıçapını girin: ");
        yariCap = input.nextInt();

        double alan = pi * yariCap * yariCap;
        double cevre = 2 * pi * yariCap;

        System.out.println("Dairenin alanı: " + alan);
        System.out.println("Dairenin çevresi: " + cevre);
    }
}
