package hw07;

/**
 * Created by user on 30.05.2017.
 */

// 3. Вывести первую и вторую половину одномерного массива.
public class Arr03 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        firstSecondHalf(arr);
    }

    static void firstSecondHalf(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            System.out.print(arr[i]);
        }
        for (int i = arr.length / 2; i < arr.length; i++) {
            System.out.print("\n" + arr[i]);
        }
    }
}
