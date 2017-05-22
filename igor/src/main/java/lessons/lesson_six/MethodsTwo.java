package lessons.lesson_six;

/**
 * Created by User on 5/22/2017.
 */
public class MethodsTwo {
    public static void main(String[] args) {
        System.out.println(literals(4, 5));
    }

    public static int literals(int a, int b) {
        int sum = 3;
        for (a = 0; a < 5; a++) {
            System.out.println(sum = a + b);
        }

        return sum;
    }

}
