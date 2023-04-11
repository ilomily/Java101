import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {
      

        double kdv;
        double kdvliFiyat, kdvTutari, fiyat;

        System.out.print("KDV'siz fiyat: ");

        Scanner input = new Scanner(System.in);
        fiyat =  input.nextDouble();

        kdv = fiyat <= 1000 ? 0.18 : 0.08;
        kdvTutari = fiyat*kdv;
        kdvliFiyat = fiyat + kdvTutari;

        System.out.println("KDV Oranı: "+kdv);
        System.out.println("KDV'li Fiyat: " + kdvliFiyat);
        System.out.println("KDV Tutarı: " + kdvTutari);





    }
}
