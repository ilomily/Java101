public class BwithStars {
    public static void main(String[] args) {

        String[][] b_with_stars = new String[6][4];

        for(int i = 0; i < b_with_stars.length; i++ ){
            for(int j = 0; j<b_with_stars[i].length;j++){
                if(i==2 && j==3){
                    b_with_stars[i][j]= "   ";
                }else if(i==0 || i==2 || i==5){
                    b_with_stars[i][j]= " * ";

                }else if (j==0 || j==3) {
                    b_with_stars[i][j]= " * ";

                }else
                    b_with_stars[i][j]="   ";


            }
        }



        for(String[] row: b_with_stars){
            for(String col: row) {
                System.out.print(col);
            }
            System.out.println();
        }



    }
}
