import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {

        int armut, elma, domates, muz, patlican;
        float toplam;
        float armutF=2.14f;
        float elmaF =3.67f;
        float domatesF = 1.11f;
        float muzF= 0.95f;
        float patlicanF = 5.0f;


        Scanner input = new Scanner(System.in);

        System.out.println("Kaç kilo armut?");
        armut = input.nextInt();
        System.out.println("Kaç kilo elma?");
        elma = input.nextInt();
        System.out.println("Kaç kilo domates?");
        domates = input.nextInt();
        System.out.println("Kaç kilo muz?");
        muz = input.nextInt();
        System.out.println("Kaç kilo patlican?");
        patlican = input.nextInt();

        toplam = (armutF*armut) + (elmaF*elma) + (domatesF*domates) + (muzF*muz) + (patlicanF * patlican);
        System.out.println("Toplam: " + toplam);




    }
}
