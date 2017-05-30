package cw_08;

import java.util.Arrays;

/**
 1. Вывести в консоль все парные числа одномерного массива.
 2. Вывести все числа одномерного массива в обратном порядке.
 3. Вывести первую и вторую половину одномерного массива.
 4. Вывести первую и вторую половину одномерного массива в обратном порядке.
 5. Найти сумму всех элементов в массиве.
 6. Найти среднеарифметическое всех чисел массива.
 7. Найти минимальное и максимальное число в массиве.
 8. Заменить все отрицательные числа в массиве на 0.
 9. Подсчитать одинаковые числа в одномерном массиве.
 10. Поменять минимальное и максимальное числа в массиве местами.
 11. Инвертировать массив.
 12. Вывести в консоль половину массива, среднеарифметическое которых является большим.
 13. Найти сумму отрицательных чисел в одномерном массиве.
 14. Дан массив чисел, среди которых имеется один ноль. Вывести на печать все числа до нуля включительно.
 15. Написать программу, меняющую местами два наибольших элемента одномерного массива с первым и последним.
 16. Написать программу, которая выводит на экран элементы одномерного массива, которые расположены до минимального элемента всего массива.
 17. Найти сумму всех чисел находящихся между минимальным и максимальным числом в массиве.
 18. Вывести в консоль половину массива в которой находиться наименьшее число массива.
 19. Написать программу, которая перемещает в конец массива все элементы, значения которых находится в отрезке [a,b].
 */
public class Test {
    public static void main(String[] args) {
        int[] nums = {2, 5, 12, 34, 1, 22, 8, 66, 12};
//        printArrayPairNums(nums);

//        System.out.println(findMinArrayValue(nums));

//        changeArrayMinAndMax(nums);
//        System.out.println(Arrays.toString(nums));

//        printMinArrayHalf(nums);

//        int[] subArray = getSubArray(nums, 5, 8);
        System.out.println(calcArraySumBetweenMinAndMax(nums));
    }

    /**
     * Вывести в консоль все парные числа одномерного массива.
     */
    static void printArrayPairNums(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int cond = arr[i] % 2;
            if (cond == 0) {
                System.out.println(arr[i]);
            }
        }
    }

    /**
     * Найти минимальное число в массиве.
     */
    static int findMinArrayValue(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    /**
     * Найти максимальное число в массиве.
     */
    static int findMaxArrayValue(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    static void changeArrayMinAndMax(int[] arr) {
        int min = findMinArrayValue(arr);
        int max = findMaxArrayValue(arr);
        int minInx = getArrayIndexByValue(arr, min);
        int maxInx = getArrayIndexByValue(arr, max);
        arr[minInx] = max;
        arr[maxInx] = min;
    }

    /**
     * Вывести первую половину одномерного массива.
     */
    static void printFirstArrHalf(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    /**
     * Вывести вторую половину одномерного массива.
     */
    static void printSecondArrHalf(int[] arr) {
        for (int i = arr.length / 2; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    /**
     * Вывести в консоль половину массива в которой находиться наименьшее число массива.
     */
    static void printMinArrayHalf(int[] arr) {
        int min = findMinArrayValue(arr);
        int minInx = getArrayIndexByValue(arr, min);
        if (minInx > arr.length / 2) {
            printSecondArrHalf(arr);
        } else {
            printFirstArrHalf(arr);
        }
    }

    static int getArrayIndexByValue(int[] arr, int value) {
        int inx = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                inx = i;
            }
        }
        return inx;
    }

    static int calcArraySum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i] + sum;
        }
        return sum;
    }

    static int calcArraySumBetweenMinAndMax(int[] arr) {
        int min = findMinArrayValue(arr);
        int max = findMaxArrayValue(arr);
        int minInx = getArrayIndexByValue(arr, min);
        int maxInx = getArrayIndexByValue(arr, max);
        int[] subArray = getSubArray(arr, minInx, maxInx);
        return calcArraySum(subArray);
//        return calcArraySum(getSubArray(arr, getArrayIndexByValue(arr, findMinArrayValue(arr)), getArrayIndexByValue(arr, findMaxArrayValue(arr))));
    }

    static int[] getSubArray(int[] arr, int from, int to) {
        int size = to - from;
        int[] res = new int[size];
        for (int i = 0; i < size; i++) {
            res[i] = arr[from++];
        }
        return res;
    }
}
