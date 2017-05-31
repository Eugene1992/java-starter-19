package hw07;

/**
 * Created by user on 31.05.2017.
 */

import java.util.Arrays;

/**
 * 10. Поменять минимальное и максимальное числа в массиве местами.
 * 11. Инвертировать массив.
 * 12. Вывести в консоль половину массива, среднеарифметическое которых является большим.
 */
public class Arr07 {
    public static void main(String[] args) {
        int[] arr = {9, 8, 5, 12, 1, 24, 12, 77};
        //  changeMinAndMax(arr);
        // invertArr(arr);
//        printBiggestAverageHalf(arr);
        System.out.println(Arrays.toString(arr));
        invertArr(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void printBiggestAverageHalf(int[] arr) {
        double sum1 = 0;
        double sum2 = 0;
        double avg1 = 0;
        double avg2 = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            sum1 = arr[i] + sum1;
        }
        avg1 = sum1 / (arr.length / 2);

        for (int i = arr.length / 2; i < arr.length; i++) {
            sum2 = arr[i] + sum2;
        }
        avg2 = sum2 / (arr.length / 2);

        if (avg1 > avg2) {
            for (int i = 0; i < arr.length / 2; i++) {
                System.out.println(arr[i]);
            }
        } else {
            for (int i = arr.length / 2; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
    }

    static void invertArr(int[] arr) {
//        i -> 0 1 2 ... 7
//        j -> 7 6 5 ...
        for (int i = 0, j = arr.length - 1; j >= arr.length / 2; i++, j--) {
            int buf = arr[i];
            arr[i] = arr[j];
            arr[j] = buf;
        }
    }

//                 0  1  2  3   4  5   6   7
//    int[] arr = {9, 8, 5, 12, 1, 24, 12, 77};
    static int getArrayIndexByValue(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }

    //    int[] arr = {9, 8, 5, 12, 77, 24, 12, 1};
    static void changeMinAndMax(int[] arr) {
        int min = Arr05.calcMinArr(arr); // 1
        int max = Arr05.calcMaxArr(arr); // 77
        int minInx = getArrayIndexByValue(arr, min); // 4
        int maxInx = getArrayIndexByValue(arr, max); // 7
        arr[minInx] = max;
        arr[maxInx] = min;
    }
}

