package lessons.lesson_six;

/**
 * Created by User on 5/22/2017.
 */
public class MethodsTwo {
    public static void main(String[] args) {
        System.out.println(literals(0, 5));
        System.out.println(literals(4, 15));
    }

    public static int literals(int from, int to) {
        int sum = 0;
        for (int i = from; i <= to; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
