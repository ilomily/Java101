import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {

        double acilis = 10;
        double km;
        double kmUcret = 2.2;
        int minUcret = 20;
        double total = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Gidilecek mesafeyi km türünden giriniz: ");
        double mesafe = input.nextInt();


        for(int i = 1; i<= mesafe; i++){
            total += kmUcret;
        }

        if((acilis + total)<minUcret){
            System.out.println("Ödenecek Tutar: " + minUcret);
        }else{
            System.out.println("Ödenecek Tutar: " + (acilis + total));
        }

    }
}
