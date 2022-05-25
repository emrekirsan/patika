import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ay, gun;
        String burc = "";
        boolean hata = false;

        System.out.print("Hangi ayda doğdunuz?: ");
        ay = input.nextInt();
        System.out.print("Hangi gün doğdunuz?: ");
        gun = input.nextInt();

        if (ay == 1) {
            if (gun <= 21) {
                burc = "Oğlak";
            }
            else if (gun <= 31) {
                burc = "Kova";
            }
            else {
                hata = true;
            }
        }

        if (ay == 2) {
            if (gun <= 19) {
                burc = "Kova";
            }
            else if (gun <= 29) {
                burc = "Balık";
            }
            else {
                hata = true;
            }
        }

        if (ay == 3) {
            if (gun <= 20) {
                burc = "Balık";
            }
            else if (gun <= 31) {
                burc = "Koç";
            }
            else {
                hata = true;
            }
        }

        if (ay == 4) {
            if (gun <= 20) {
                burc = "Koç";
            }
            else if (gun <= 30) {
                burc = "Boğa";
            }
            else {
                hata = true;
            }
        }

        if (ay == 5) {
            if (gun <= 21) {
                burc = "Boğa";
            }
            else if (gun <= 31) {
                burc = "İkizler";
            }
            else {
                hata = true;
            }
        }

        if (ay == 6) {
            if (gun <= 22) {
                burc = "İkizler";
            }
            else if (gun <= 30) {
                burc = "Yengeç";
            }
            else {
                hata = true;
            }
        }

        if (ay == 7) {
            if (gun <= 22) {
                burc = "Yengeç";
            }
            else if (gun <= 31) {
                burc = "Aslan";
            }
            else {
                hata = true;
            }
        }

        if (ay == 8) {
            if (gun <= 22) {
                burc = "Aslan";
            }
            else if (gun <= 31) {
                burc = "Başak";
            }
            else {
                hata = true;
            }
        }

        if (ay == 9) {
            if (gun <= 21) {
                burc = "Başak";
            }
            else if (gun <= 30) {
                burc = "Terazi";
            }
            else {
                hata = true;
            }
        }

        if (ay == 10) {
            if (gun <= 22) {
                burc = "Terazi";
            }
            else if (gun <= 31) {
                burc = "Akrep";
            }
            else {
                hata = true;
            }
        }

        if (ay == 11) {
            if (gun <= 21) {
                burc = "Akrep";
            }
            else if (gun <= 30) {
                burc = "Yay";
            }
            else {
                hata = true;
            }
        }

        if (ay == 12) {
            if (gun <= 21) {
                burc = "Yay";
            }
            else if (gun <= 31) {
                burc = "Oğlak";
            }
            else {
                hata = true;
            }
        }

        if ((ay > 12) || ay < 1) {
            System.out.println("Hatalı ay girişi yaptınız.");
        }
        else if (hata) {
            System.out.println("Hatalı gün girişi yaptınız.");
        }
        else {
            System.out.println("Burcunuz: " + burc);
        }
    }
}
