package cw06;

/**
 * Created by Student on 22-May-17.
 */
public class TestMethod03 {
    public static void main (String [] args) {
       int bin = numSys(47);
    }

    static int numSys (int a){
        String res = "";
        for (; a > 0; a = a / 2) {
            res = a % 2 + res;
        }
        System.out.println(res);
        return a;
    }
}
