package lessons.myTests;

/**
 * Created by User on 19.05.2017.
 */
public class Test_HW {
    public static void main(String[] args) {
        for (int i = 2; ; i *= 2) {
            System.out.print(i + " ");
        }
    }

    public static class HW_H2 {
        public static void main(String[] args) {
            for (int i = 2; i <= 20; i *= 2) {
                for (int j = 2; j >= i; j *= 2) {
                    System.out.print(j + " ");
                }
            }
        }
    }
}
