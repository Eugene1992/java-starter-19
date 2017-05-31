package hw07;

/**
 * Created by user on 30.05.2017.
 */
//4. Вывести первую и вторую половину одномерного массива в обратном порядке.
public class Arr04 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        firstHalfBack(arr);
        secondHalfBack(arr);
    }

    static void firstHalfBack(int[] arr) {
        for (int i = (arr.length / 2) - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }

    }

    static void secondHalfBack(int[] arr){
        for (int i = arr.length - 1; i >= arr.length / 2; i--) {
            System.out.println(arr[i]);
        }
    }
}


