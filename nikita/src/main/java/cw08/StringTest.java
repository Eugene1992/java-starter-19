package cw08;

/**
 * Created by Student on 29-May-17.
 */
public class StringTest {
    public static void main(String[] args) {
        String str = "Nikita";
        stringBack(str);
    }

    static void stringBack(String str) {
        char[] chars = str.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }
    }
}
