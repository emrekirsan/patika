import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlikOnerme {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sicaklik;

        System.out.print("Hava kaç derece?: ");
        sicaklik = input.nextInt();

        if (sicaklik >= -15 && sicaklik <= 50) {
            if (sicaklik <= 5) {
                System.out.println("Sıcaklık: " + sicaklik + " derece, kayak yapabilirsiniz.");
            }
            else if (sicaklik > 5 && sicaklik <= 15) {
                System.out.println("Sıcaklık: " + sicaklik + " derece, sinemaya gidebilirsiniz.");
            }
            else if (sicaklik > 15 && sicaklik <= 25) {
                System.out.println("Sıcaklık: " + sicaklik + " derece, piknik yapabilirsiniz.");
            }
            else if (sicaklik > 25) {
                System.out.println("Sıcaklık: " + sicaklik + " derece, yüzmeye gidebilirsiniz.");
            }
        }
        else if (sicaklik < -16) {
            System.out.println("Hava dışarı çıkmak için çok soğuk, evde kalın.");
        }
        else {
            System.out.println("Hava dışarı çıkmak için çok sıcak, evde kalın.");
        }
    }
}
