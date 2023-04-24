import java.util.Scanner;
public class RecursiveAsalSayiBulma {
    static boolean isPrime(int n, int i){

        if (n == 2){
            return true;
        }
        else if(n<=1)
            return false;

        else if(n%i != 0 && n>i){
            return isPrime(n, i+1);
        }
        else if(n%i ==0 && n>i){
            return false;
        }
        return true;

    }



    public static void main(String[] args) {
        int i =2;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println(isPrime(a,i));
    }
}
