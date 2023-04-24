import java.util.Scanner;

public class BasamakSayilariToplama {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
        System.out.println("Sayı girin: ");
        int n = sc.nextInt();

        int temp = n;
        int remainder;
        int total = 0;

        while(temp>0){
            remainder = temp%10;
            temp = temp/10;
            total += remainder;
            remainder=1;

        }
        System.out.println(total);

    }
}
