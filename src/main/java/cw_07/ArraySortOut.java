package cw_07;

import java.util.Arrays;

public class ArraySortOut {
    public static void main(String[] args) {
//                    0  1  2   3  4  5  6  7       8
        int[] ints = {4, 6, 12, 2, 5, 7, 3, 11};

        /*System.out.println(ints[0]);
        System.out.println(ints[1]);
        System.out.println(ints[2]);
        System.out.println(ints[3]);
        System.out.println(ints[4]);
        System.out.println(ints[5]);
        System.out.println(ints[6]);
        System.out.println(ints[7]);*/

//        System.out.println(Arrays.toString(ints));

        int[] ints2 = {4, 6, 12, 2};

        printArray(ints);
        System.out.println();
        printArray(ints2);
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

//    1. Создать и заполнить числовой массив. Вывести массив на экран.
//    2. Вывести на экран в обратном порядке
//    3. Подсчитать сумму элементов массива

}
