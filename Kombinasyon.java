import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        //C(n,r) = n! / (r! * (n-r)!)

        System.out.println("Küme eleman sayısını girin: ");
        int n = input.nextInt();
        System.out.println("Alt küme eleman sayısını girin: ");
        int r = input.nextInt();
        //n!
        int nf = 1;
        for(int i =1; i<=n; i++) {
            nf *= i;
        }
       // System.out.println("n!= " + nf);
        //r!
        int rf=1;
        for(int i = 1; i<=r; i++)
        {
           rf*=i;
        }
       // System.out.println("r!=" + rf);

        int rnf=1;
        for(int i = 1 ; i<=(n-r); i++){
            rnf *= i;
        }
        //System.out.println("n-r!=" + rnf);

        int c =  nf/(rf*rnf);
        System.out.println("C(" + n + "," + r + "): " + c);


    }
}

