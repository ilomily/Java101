import java.util.Arrays;
import java.util.Scanner;

public class ArraysMaxMinDeger {
    public static void main(String[] args) {
        //max min değer bul, yazdır
        //girilen değere en yakın max ve min i bul

        int[] list = {56, 34, 1, 8, 101, -2, -33};

        Scanner input = new Scanner(System.in);



        Arrays.sort(list);
        System.out.println("En küçük değer: " + list[0] + "\nEn büyük değer: " + list[list.length -1] );

        System.out.println("Bir değer girin: ");
        int n = input.nextInt();
        if(Arrays.binarySearch(list, n) < 0 ){

            int[] newlist = Arrays.copyOf(list, list.length+1);
            newlist[list.length] = n;
            Arrays.sort(newlist);
            int index = Arrays.binarySearch(newlist, n);
            System.out.println("Sayıdan küçük en yakın değer: " + newlist[index-1]);
            System.out.println("Sayıdan büyük en yakın değer: " + newlist[index+1]);


        }else{
            int index = Arrays.binarySearch(list, n);
            System.out.println("Sayıdan küçük en yakın değer: "  + list[index-1]);
            System.out.println("Sayıdan büyük en yakın değer: " + list[index+1]);

        }



    }
}
