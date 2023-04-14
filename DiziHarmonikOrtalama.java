public class DiziHarmonikOrtalama {
    public static void main(String[] args) {
        double [] arr = new double[]{34, 55, 67, 44, 200, 55, 84};
        double harmAvarage;
        double harmSum = 0;
// n/(1/arr[i]+..)
        for(int i = 0; i < arr.length; i++){
            harmSum+= 1/arr[i];
        }

        harmAvarage = arr.length/harmSum;
        System.out.println(harmAvarage);


    }
}
