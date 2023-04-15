import java.util.Scanner;
public class UsluSayiYazdirma {
    public static void main(String[] args) {
        int b;
        int e;

        Scanner input = new Scanner(System.in);
        System.out.println("Taban sayısını girin: ");
        b = input.nextInt();
        System.out.println("Sayının kuvvetini girin: ");
        e = input.nextInt();

        int result = 1;
        for(int i = 1; i<=e; i++){
            result *= b;

        }
        System.out.println(result);


    }
}
