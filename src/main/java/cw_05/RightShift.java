package cw_05;

public class RightShift {
    public static void main(String[] args) {
        byte b = 16;
        int s = b >> 2;


//                  0001 0000 >> 2
//        0000 0000 0000 0100

        System.out.println(s);
    }
}
