import java.util.Scanner;

public class SayilariKucuktenBuyugeSiralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c;

        System.out.print("Lütfen ilk sayıyı girin: ");
        a = input.nextInt();
        System.out.print("Lütfen ikinci sayıyı girin: ");
        b = input.nextInt();
        System.out.print("Lütfen üçüncü sayıyı girin: ");
        c = input.nextInt();

        if (a < b && a < c) {
            if (b < c)
                System.out.println(a + " < " + b + " < " + c);
            else {
                System.out.println(a + " < " + c + " < " + b);
            }
        }

        if (b < a && b < c) {
            if (a < c)
                System.out.println(b + " < " + a + " < " + c);
            else {
                System.out.println(b + " < " + c + " < " + a);
            }
        }

        if (c < a && c < b) {
            if (a < b)
                System.out.println(c + " < " + a + " < " + c);
            else {
                System.out.println(c + " < " + b + " < " + a);
            }
        }
    }
}
