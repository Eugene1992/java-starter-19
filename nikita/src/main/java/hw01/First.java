package hw01;

/**
 * Created by user on 14.05.2017.
 */
public class First {
    public static void main (String [] args) {
        oneVar(5);
        twoVar(16);
        threeVar(24);
        fourVar(46);
    }

    static void oneVar(int a) {
        byte i = 0;
        a = i;
        System.out.println(a);
    }
    static void twoVar(int b) {
        short x = 0;
        b = x;
        System.out.println(b);
    }
    static void threeVar(int c) {
        System.out.println(c);
    }
    static void fourVar(long d) {
        System.out.println(d);
    }

}

