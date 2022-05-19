import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String id = "emre", password = "kirsan", userLogin1, userLogin2, forgetPassword;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı girin: ");
        userLogin1 = input.nextLine();
        System.out.print("Şifrenizi girin: ");
        userLogin2 = input.nextLine();

        if (userLogin1.equals(id) && userLogin2.equals(password)) {
            System.out.println("Başarıyla giriş yaptınız.");
        }

        else {
            System.out.print("Girdiğiniz kullanıcı adı veya şifre yanlış.\n" +
                    "Yeni bir kullanıcı adı ve şifre oluşturmak ister misiniz? (evet veya hayır): ");
        }

        forgetPassword = input.nextLine();

        if (forgetPassword.equals("evet")) {
            System.out.print("Yeni kullanıcı adınızı girin: ");
            userLogin1 = input.nextLine();
            id = userLogin1;
            System.out.print("Yeni şifrenizi girin: ");
            userLogin2 = input.nextLine();
            password = userLogin2;

            System.out.println("Lütfen tekrar giriş yapmayı deneyiniz: ");

            System.out.print("Kullanıcı adınızı girin: ");
            userLogin1 = input.nextLine();
            System.out.print("Şifrenizi girin: ");
            userLogin2 = input.nextLine();

            if (id.equals(userLogin1) && password.equals(userLogin2)) {
                System.out.println("Başarıyla giriş yaptınız.");
            }
        }
        else if (forgetPassword.equals("hayır")) {
            System.out.println("Lütfen şifrenizi değiştirip daha sonra deneyiniz.\nProgramdan çıkılıyor...");
        }
    }
}
