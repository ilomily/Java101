
import java.util.Scanner;
public class NotOrtHesapla {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunu giriniz: ");
        mat = input.nextInt();
        System.out.println("Fizik notunu giriniz: ");
        fizik = input.nextInt();
        System.out.println("Kimya notunu giriniz: ");
        kimya = input.nextInt();
        System.out.println("Türkçe notunu giriniz: ");
        turkce = input.nextInt();
        System.out.println("Tarih notunu giriniz: ");
        tarih = input.nextInt();
        System.out.println("Müzik notunu giriniz: ");
        muzik = input.nextInt();

        int toplam = mat+fizik+kimya+tarih+turkce+muzik;
        double sonuc = toplam/6;
        System.out.println("Ortalamanız: " + sonuc);

        boolean gecti = toplam/6 >=60;
        String gecmeDurumu = gecti ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(gecmeDurumu);

    }
}
