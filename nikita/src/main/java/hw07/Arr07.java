package hw07;

/**
 * Created by user on 31.05.2017.
 */

/**
 * 10. Поменять минимальное и максимальное числа в массиве местами.
 * 11. Инвертировать массив.
 * 12. Вывести в консоль половину массива, среднеарифметическое которых является большим.
 */
public class Arr07 {
    public static void main(String[] args) {
        int[] arr = {9, 8, 5, 12, 1, 24, 46, 77};
      //  changeMinAndMax(arr);
       // invertArr(arr);
        printBiggestAverageHalf(arr);
    }

    static void printBiggestAverageHalf(int[] arr){
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

       if(avg1 > avg2){
           System.out.println(avg1);
       } else {
           System.out.println(avg2);
       }
    }

    static void invertArr(int[]arr){
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
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

    static void changeMinAndMax(int[] arr) {
        int min = Arr05.calcMinArr(arr);
        int max = Arr05.calcMaxArr(arr);
        int minInx = getArrayIndexByValue(arr, min);
        int maxInx = getArrayIndexByValue(arr, max);
        arr[minInx] = max;
        arr[maxInx] = min;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}

