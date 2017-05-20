package hw03;

/**
 * Created by user on 19.05.2017.
 */
public class Program_5 {
    public static void main(String[] args) {
        int prev1 = 0;
        int prev2 = 1;
        System.out.print(prev1 + " " + prev2);
        int c = 0;
        int newElem = 0;
        while (c < 20) {
            newElem = prev1 + prev2;
            prev1 = prev2;
            prev2 = newElem;
            System.out.print(" " + newElem);
            c++;
        }
    }
}
