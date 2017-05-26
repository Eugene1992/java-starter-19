package hw03;

/**
 * Created by user on 19.05.2017.
 */
public class Program_3 {
    public static void main(String[] args) {
        crateProg3(90);
    }

    static void crateProg3(int count) {
        do {
            System.out.print(count + " ");
            count -= 5;
        }
        while (count >= 0);
    }
}
