package hw03;

/**
 * Created by user on 19.05.2017.
 */
public class Program_4 {
    public static void main(String[] args) {
        createProg4(2);
    }

    static void createProg4(int count) {
        for (; count < 2000000; count *= 2){
            System.out.print(count + " ");
        }
    }
}
