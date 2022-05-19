import java.util.Scanner;

public class KdvTutarHesaplama {
    public static void main(String[] args) {

        boolean kdvSorgu;
        double kdvOran;
        double kdvOranDonustur;

        Scanner input = new Scanner(System.in);
        System.out.println("KDV Hesaplama Programı\n" +
                        "****************************");

            // Veri alma

        System.out.print("KDVsini hesaplayacağınız tutarı girin: ");
        double hesaplanacakTutar = input.nextInt();

            // KDV oranı sorgulama

        kdvSorgu = (0<hesaplanacakTutar) && (hesaplanacakTutar<1000);
        kdvOran = kdvSorgu ? 18: 8;
        kdvOranDonustur = kdvOran/100 * hesaplanacakTutar;

            // Sonuç

        System.out.println("Girilen tutar: " + hesaplanacakTutar + "\nKDV oranı: %" + kdvOran + "\nToplam: " + (kdvOranDonustur + hesaplanacakTutar));

    }
}
