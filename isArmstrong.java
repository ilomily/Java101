import java.util.Scanner;
public class isArmstrong {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("isArmstrong?: ");
        int n = input.nextInt();

        int temp = n;
        int basamak= 0;

        while(temp!=0){
            basamak++;
            temp=temp/10;

        }
        int result=1;
        int temp1=n;
        int total=0;
        while(temp1!=0)
        {
            for(int i = 1; i<=temp1; i*=10)
            {
                int b= temp1%10;
                temp1=temp1/10;


                for(int j =1; j<=basamak;j++) {
                    result *=b;

                }
                total += result;
                result = 1;
            }
        }
        if(total == n)
            System.out.println(n + " is an Armstrong number.");
        else{
            System.out.println(n + " is not an Armstrong number.");
        }

    }
}
