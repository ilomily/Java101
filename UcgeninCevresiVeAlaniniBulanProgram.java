import java.util.Scanner;

public class UcgeninCevresiVeAlaniniBulanProgram {
    public static void main(String[] args) {

        double kenar1, kenar2, kenar3, u, cevre, alan;

        Scanner input = new Scanner(System.in);

        System.out.println("1.kenar uzunluğu: ");
        kenar1 = input.nextDouble();
        System.out.println("2.kenar uzunluğu: ");
        kenar2 = input.nextDouble();
        System.out.println("3.kenar uzunluğu: ");
        kenar3 = input.nextDouble();

        u = (kenar1 + kenar2 + kenar3)/2;
        cevre = 2*u;
        System.out.println("Üçgenin çevresi: " + cevre);

        alan= Math.sqrt(u * (u - kenar1)* (u - kenar2) * (u - kenar3));
        System.out.println("Üçgenin alanı: " + alan);


    }
}
