package hw03;

/**
 * Created by user on 19.05.2017.
 */
public class Program_2 {
    public static void main(String[] args) {
        createProg2(1);

    }
    static void createProg2(int count) {
        do {
            System.out.print(count + " ");
            count += 2;
        }
        while (count < 110) ;
    }

}
