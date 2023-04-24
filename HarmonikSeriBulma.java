import java.util.Scanner;

public class HarmonikSeriBulma {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Sayi girin: ");
        int n = input.nextInt();
        float total = 0;

        for(float i = 1; i<=n; i++){
            float h = 1/i;
            total += h;

        }
        System.out.println(total);

    }
}
