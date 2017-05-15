package hw01;

/**
 * Created by user on 15.05.2017.
 */
public class Fifth {
    public static void main (String [] args) {
        short a = 9;
        short b = 3;
        short c = (short) (a / b);
        byte d = 10;
        byte e = 5;
        byte f = (byte) (d / e);
        int g = (int) (c * f);
        System.out.println(g);
    }
}
