package hw07;

public class ChangeExample {
    public static void main(String[] args) {
        int[] arr = {100, 4, 12, 22, 45, 1};
        printBiggestAverageHalf(arr);
    }

    static void printBiggestAverageHalf(int[] arr) {
        double avg1, avg2;

        int half = arr.length / 2;

        avg1 = calcArraySum(arr, 0, half) / half;
        avg2 = calcArraySum(arr, half, arr.length) / half;

        if (avg1 > avg2) {
            printArray(arr, 0, half);
        } else {
            printArray(arr, half, arr.length);
        }
    }

    static int calcArraySum(int[] arr, int from, int to) {
        int sum = 0;
        for (int i = from; i < to; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static void printArray(int[] arr, int from, int to) {
        for (int i = from; i < to; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
