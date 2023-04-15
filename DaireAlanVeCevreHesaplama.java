import java.util.Scanner;

public class DaireAlanVeCevreHesaplama {
    public static void main(String[] args) {

        double pi = 3.14;

        Scanner input = new Scanner(System.in);
        System.out.println("Dairenin yarı çapını girin:");
        int r = input.nextInt();

        double cevre = 2*pi*r;
        System.out.println("Çevre: " + cevre);

        double alan = pi*r*r;
        System.out.println("Alan: " + alan);

        System.out.println("Daire diliminin açısını girin: ");
        int a = input.nextInt();

        double dilimAlani = (pi*r*r*a)/360;
        System.out.println("Daire diliminin alanı: " + dilimAlani);



    }
}
