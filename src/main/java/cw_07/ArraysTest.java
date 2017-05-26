package cw_07;

public class ArraysTest {
    public static void main(String[] args) {
        int[] arr = new int[4];
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        arr[0] = 77;
        arr[1] = 44;
        arr[2] = 1;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);


    }

    static int[] plus(int a, int b) {
        int[] arr = new int[3];
        arr[0] = a;
        arr[1] = b;
        arr[2] = a + b;
        return arr;
    }
}
