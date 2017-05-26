package hw03;

/**
 * Created by user on 18.05.2017.
 */
public class Program_1 {
    public static void main(String[] args) {
        createProg1(1000);
    }

    static void createProg1(int count) {
        while (count < 10000) {
            System.out.println(count);
            count += 3;
        }
    }
}
