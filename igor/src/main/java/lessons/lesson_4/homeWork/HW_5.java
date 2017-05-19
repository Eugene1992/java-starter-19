package lessons.lesson_4.homeWork;

/**
 * Created by User on 18.05.2017.
 */
public class HW_5 {
    public static void main(String[] args) {
            int c = 20;
            int a = 1;
            int b = 1;
            System.out.print(a + " " + b);
            int fib = 2, i = 2;
            while (i < c) {
                fib = a + b;
                a = b;
                b = fib;
                System.out.print(" " + fib);
                i++;
            }
        }

    }

