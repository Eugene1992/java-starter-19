package hw07;

/**
 * Created by user on 31.05.2017.
 */
/**5. Найти сумму всех элементов в массиве.
 6. Найти среднеарифметическое всех чисел массива.
 7. Найти минимальное и максимальное число в массиве.
 8. Заменить все отрицательные числа в массиве на 0.
*/
public class Arr05 {
    public static void main(String[] args) {
        int[] arr = {12, -23, 12, -23, 58};
      //  calcSum(arr);
      //  calcAverage(arr);
      /**  System.out.println(calcMinArr(arr));
        System.out.println(calcMaxArr(arr)); */
        changeNumbers(arr);

    }


    static void changeNumbers(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0){
                arr[i] = 0;
            }
            System.out.println(arr[i]);
        }
    }

    static void calcSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i] + sum;
        }
        System.out.println(sum);
    }

    static void calcAverage(int[] arr){
        double sum = 0;
        double average = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i] + sum;
        }
        average = sum / arr.length;
        System.out.println(average);
    }

    static int calcMinArr(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

    static int calcMaxArr(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
