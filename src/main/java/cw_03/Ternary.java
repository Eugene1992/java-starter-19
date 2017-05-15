package cw_03;

public class Ternary {
    public static void main(String[] args) {
        int k = -10;
        int j;
//           (condition) ? true : false;
        int t = k > 0    ?   1  :   -1;

        if (k > 0) {
            j = 1;
        } else {
            j = -1;
        }

        System.out.println(j);
        System.out.println(t);
    }
}
