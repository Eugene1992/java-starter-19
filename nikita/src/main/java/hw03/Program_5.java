package hw03;

/**
 * Created by user on 19.05.2017.
 */
public class Program_5 {
    public static void main(String[] args) {
        createProg5(0, 1, 0, 0);
    }

    static void createProg5(int prev1 , int prev2 , int c , int newElem){
        System.out.print(prev1 + " " + prev2);
        while (c < 20) {
            newElem = prev1 + prev2;
            prev1 = prev2;
            prev2 = newElem;
            System.out.print(" " + newElem);
            c++;
        }
    }
}
