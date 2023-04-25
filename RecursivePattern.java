import java.util.Scanner;
public class RecursivePattern {
    static void recursivePattern(int n, int temp, boolean minus) {


        System.out.println(temp);

        if (temp > 0 && minus) {

            if (temp - 5 <= 0)
                minus = false;
            recursivePattern(n, temp - 5, minus);

        } else if (temp <= 0 || !minus) {
            minus = false;
            temp += 5;
            if (temp < n)
                recursivePattern(n, temp, false);
            else if (temp == n && !minus)
                System.out.println(temp);

        }
    }







    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        recursivePattern(n, n,true);
    }
}
