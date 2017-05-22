package cw06;

/**
 * Created by Student on 22-May-17.
 */
public class TestMethod03 {
    public static void main (String [] args) {
       String result = numSys(47);
       System.out.println(result);
    }

    static String numSys (int a){
        String res = "";
        for (; a > 0; a = a / 2) {
            res = a % 2 + res;
        }
        return res;
    }
}
