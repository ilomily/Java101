public class AsalSayiBulma {
    public static void main(String[] args) {

        for(int i = 2; i<100; i++) {
            int a = i;
            boolean asal=false;
            for (int j = a; j > 1; j--) {
                if (a % j == 0 && a!=j) {
                   asal =false;

                    break;

                }asal=true;

            }
            if(asal)
            { System.out.println(a + "asal");}

        }    }
}
