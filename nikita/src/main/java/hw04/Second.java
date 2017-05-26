package hw04;

/**
 * Created by user on 22.05.2017.
 */
public class Second {
    public static void main(String[] args) {
        int b = 0;
        for (int h = 0; h < 24; h++) {
            for (int m = 0; m < 60; m++) {
                int h1 = h / 10;
                int h2 = h % 10;
                int m1 = m / 10;
                int m2 = m % 10;
                if (h1 == m2 && h2 == m1) {
                    System.out.println(h1 + "" + h2 + ":" + m1 + "" + m2);
                    b++;
                }
            }
        }
        System.out.println("Всего " + b + " совпадений");
    }
}
