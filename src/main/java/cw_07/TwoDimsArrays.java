package cw_07;

public class TwoDimsArrays {
    public static void main(String[] args) {
        /*int[][] arr = new int[3][3];

        arr[0][0] = 0;
        arr[0][1] = 0;
        arr[0][2] = 0;
        arr[1][0] = 0;
        arr[1][1] = 1;
        arr[1][2] = 0;
        arr[2][0] = 0;
        arr[2][1] = 0;
        arr[2][2] = 0;*/

        int[][] arr = {
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        byte[][] array = new byte[3][];
        array[0] = new byte[]{10, 20};
        array[1] = new byte[]{30, 40, 50, 60};
        array[2] = new byte[]{70, 80, 90};

        // Написать метод, который проверяет есть ли число в указанном массива
    }
}
