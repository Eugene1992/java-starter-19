package cw_03;

public class InnerTernary {
    public static void main(String[] args) {
        int k = 0;
        int j;

        int t = k >= 0 ? k == 0 ? 0 : 1 : -1;

        if (k >= 0) {
            if (k == 0) {
                j = 0;
            } else {
                j = 1;
            }
        } else {
            j = -1;
        }

        System.out.println(j);
        System.out.println(t);
    }
}
