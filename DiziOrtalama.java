public class DiziOrtalama {
    public static void main(String[] args) {
        int[] arr = new int[]{3,9,5,6,8,25,36,94,56};
        double avarage;
        double sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum+= arr[i];
        }

        avarage = sum / arr.length;
        System.out.println(avarage);


    }
}
