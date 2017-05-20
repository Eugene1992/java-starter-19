package cw_05;

public class LogicAndByteXor {
    public static void main(String[] args) {
        System.out.println(true ^ false); // true
        System.out.println(true ^ true);  // false
        System.out.println(false ^ false);// false

//        0000 1010
//       |
//        0000 0010
//        ---------
//        0000 1000
        System.out.println(10 ^ 2);
    }
}
