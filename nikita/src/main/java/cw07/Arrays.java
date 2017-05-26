package cw07;

/**
 * Created by user on 26.05.2017.
 */
public class Arrays {
    public static void main(String[] args) {
        int [] arr = new int [7];
        arr[0] = 5;
        arr[1] = 9;
        arr[2] = 12;
        arr[3] = 23;
        arr[4] = 46;
        arr[5] = 78;
        arr[6] = 97;

        System.out.print(arr[0] + " ");
        System.out.print(arr[1] + " ");
        System.out.print(arr[2] + " ");
        System.out.print(arr[3] + " ");
        System.out.print(arr[4] + " ");
        System.out.print(arr[5] + " ");
        System.out.println(arr[6] + " ");

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        sumArr(arr);

    }

    static void sumArr(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            sum = i + sum;
            System.out.println(sum);
        }
    }
}
