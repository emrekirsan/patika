import java.util.Scanner;

public class DikUcgendeHipotenusBulma {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int birinciKenar, ikinciKenar;
        double ucuncuKenar;

        System.out.println("Dik Üçgenin Hipotenüsünü Bulma\n" +
                "****************************");

            // veri alma

        System.out.print("İlk kenarın ölçüsünü girin: ");
        birinciKenar = input.nextInt();
        System.out.print("İkinci kenarın ölçüsünü girin: ");
        ikinciKenar = input.nextInt();

            // formül

        ucuncuKenar = Math.sqrt((birinciKenar*birinciKenar) + (ikinciKenar*ikinciKenar));
        System.out.println("Üçüncü kenarın ölçüsü: " + ucuncuKenar);

    }
}
