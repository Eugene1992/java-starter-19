package hw07;

/**
 * Created by user on 30.05.2017.
 */
/** 2. Вывести все числа одномерного массива в обратном порядке. */

public class Arr02 {
    public static void main(String[] args) {
//                   0  1  2  3  4  5  6  7
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        printBack(arr);

    }

    static void printBack(int[] arr){
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}
