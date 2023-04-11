import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName, password, newPassword;
        int reset;

        Scanner inp = new Scanner(System.in);

        System.out.println("Kullanıcı adı: ");
        userName = inp.nextLine();
        System.out.println("Şifre: ");
        password = inp.nextLine();

        if(userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Yapıldı.");
        } else{
            System.out.println("Hatalı giriş yaptınız.\nŞifrenizi sıfırlamak istiyorsanız 1'e basın.");
            reset = inp.nextInt();
                if(reset !=1) {
                    System.out.println("Giriş yapılamadı.");
                }else {
                    System.out.println("Önceki şifrenizden farklı, yeni bir şifre oluşturun: ");

                    newPassword = inp.next();

                    if (newPassword.equals("java123")) {
                        System.out.println("Şifre oluşturulamadı, lütfen başka bir şifre giriniz.");
                    } else {
                        System.out.println("Yeni şifre oluşturuldu.");
                    }

                }


        }
    }


}

