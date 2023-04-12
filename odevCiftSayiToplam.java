import java.util.Scanner;
public class odevCiftSayiToplam {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int total = 0;
        int n;

        do{
            System.out.println("Sayı girin: ");
            n = inp.nextInt();
            if(n%4 == 0){
                total += n;
            }


        } while(n%2==0);

        System.out.println(total);
    }
}
