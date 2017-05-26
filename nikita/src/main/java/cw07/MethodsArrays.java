package cw07;

/**
 * Created by user on 26.05.2017.
 */
public class MethodsArrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 1, 5, 1, 1};

        System.out.println("1 - " + arrMethod(arr, 1) + " counts");
        System.out.println("2 - " + arrMethod(arr, 2) + " counts");
        System.out.println("4 - " + arrMethod(arr, 4) + " counts");
    }

    static int arrMethod(int[] arr, int number) {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                count++;
            }
        }
        return count;
    }

}
