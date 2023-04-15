import java.util.Scanner;
public class BodyMassIndexCalc {
    public static void main(String[] args) {

        double height;
        double weight;
        double index;

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz :");
        height = input.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz : ");
        weight = input.nextDouble();

        index = weight/(height*height);
        System.out.println("Vücut kitle endeksiniz: " + index);


    }
}
