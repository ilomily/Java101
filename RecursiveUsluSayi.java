import java.util.Scanner;
public class RecursiveUsluSayi {

    static int usluSayi(int base, int exp){

        if(exp>1){
            return (base)*(usluSayi(base,(exp-1)));
        }
        else
            return base;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Taban değeri girin: ");
        int b = input.nextInt();
        System.out.println("Üs değeri girin: ");
        int e = input.nextInt();

        System.out.println(usluSayi(b,e));
    }
}
