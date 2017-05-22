package cw06;

/**
 * Created by Student on 22-May-17.
 */
public class TestMethod02 {
    public static void main (String [] args) {
        int sum = calc(2 , 5);
                System.out.println(sum);
    }

    static int calc (int a , int b) {
        int i = a;
        int sum = 0;
        for (; i <= b; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
