package hw03;

/**
 * Created by user on 19.05.2017.
 */
public class Program_5 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b);
        int c = 0;
        int sum = 0;
        while (c < 20) {
            sum = a + b;
            a = b;
            b = sum;
            System.out.print(" " + sum);
            c++;
        }

    }

}
