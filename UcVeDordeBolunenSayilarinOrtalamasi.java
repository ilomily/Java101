import java.util.Scanner;
public class UcVeDordeBolunenSayilarinOrtalamasi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Sayı girin: ");
        int k = input.nextInt();
        int elemanSayisi = 0;
        int toplam =0;

        for(int i=0; i<=k; i++){
            if(i%3 == 0 && i%4 == 0) {
                toplam +=i;
                elemanSayisi++;
            }
        }
        System.out.println(" 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalaması: " + (toplam/elemanSayisi));
    }
}
