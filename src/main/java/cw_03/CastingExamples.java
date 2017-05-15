package cw_03;

public class CastingExamples {
    public static void main(String[] args) {
        byte b = 10;
        byte c = 20;
        int i = b;

        byte s = (byte)(b + c);

        byte k = (byte) 200;
        System.out.println((byte)257);

        short sum = (short)(100 * 200000);
    }
}
