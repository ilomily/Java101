import java.util.Scanner;
public class Siralama {
    public static void main(String[] args) {

        int n1, n2, n3;

        Scanner input = new Scanner(System.in);

        System.out.println("Birinci sayıyı girin: ");
        n1 = input.nextInt();
        System.out.println("İkinci sayıyı girin: ");
        n2 = input.nextInt();
        System.out.println("Üçüncü sayıyı girin: ");
        n3 = input.nextInt();

        System.out.println("Küçükten büyüğe sıralama:");
        if (n1 < n2 && n1 < n3) {
            if(n2 < n3)
                System.out.println(n1 + "<" + n2 + "<"+ n3);
            else
                System.out.println(n1 +"<"+ n3 +"<"+  n2);
        }else if(n2<n1 && n2<n3){
            if(n1<n3)
                System.out.println(n2 +"<"+ n1 +"<"+ n3);
            else
                System.out.println(n2 +"<"+ n3 +"<"+ n1);}
        else if(n3<n2 && n3<n1){
            if(n1<n2)
                System.out.println(n3 + "<" + n1 +"<"+ n2);
            else
                System.out.println(n3 +"<"+ n2 +"<"+ n1);}

        System.out.println("Büyükten küçüğe sıralama: ");
        if (n1 > n2 && n1 > n3) {
            if(n2 > n3)
                System.out.println(n1 + ">" + n2 + ">"+ n3);
            else
                System.out.println(n1 +">"+ n3 +">"+  n2);
        }else if(n2>n1 && n2>n3){
            if(n1>n3)
                System.out.println(n2 +">"+ n1 +">"+ n3);
            else
                System.out.println(n2 +">"+ n3 +">"+ n1);}
        else if(n3>n2 && n3>n1){
            if(n1>n2)
                System.out.println(n3 + ">" + n1 +">"+ n2);
            else
                System.out.println(n3 +">"+ n2 +">"+ n1);}




        }


    }

