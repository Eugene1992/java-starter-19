package hw07;

/**
 * Created by user on 29.05.2017.
 */
public class Arr01 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        pairPrint(arr);

    }

    static void pairPrint(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }

        }
    }
}