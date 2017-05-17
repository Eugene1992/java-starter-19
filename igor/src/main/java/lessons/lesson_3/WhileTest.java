package lessons.lesson_3;

/**
 * Created by User on 17.05.2017.
 */
public class WhileTest {
    public static void main(String[] args) {
        int count = 1;
        while (count < 100) {
            System.out.println("count is: " + count);
            count += 2; // count = count + 2;
        }
    }
}
