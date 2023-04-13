import java.util.Scanner;
public class palindrom {
    //101,6556,848,6
    static boolean isPalindrom(int number){
        int temp=number, lastnumber, reverseNumber=0;
        while(temp != 0)
        {
            lastnumber = temp%10;
            reverseNumber = (reverseNumber*10) + lastnumber;
            temp/=10;
        }
        if(number == reverseNumber){
            System.out.println("isPalindrom");
            return true;
        }
        else{
            System.out.println("notPalindrom");
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı girin: ");
        int number = input.nextInt();
        isPalindrom(number);

    }
}
