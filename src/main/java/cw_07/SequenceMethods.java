package cw_07;

/*
* 1. Создайте программу, выводящую на экран все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….
2. Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
3. Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….
4. Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….
*/

public class SequenceMethods {
    public static void main(String[] args) {
        // 1
        printSequence(1000, 10000, 3, true);
        // 2
        printSequenceByCount(1, 55, 2);
        // 3
        printSequence(90, 0, 5, false);
    }

    static void printSequence(int start, int end, int step, boolean incr) {
        for (int i = start; i < end; ) {
            System.out.print(i + " ");
            if (incr) {
                i += step;
            } else {
                i -= step;
            }
        }
        System.out.println();
    }

    static void printSequenceByCount(int start, int count, int step) {
        for (int i = 0; i < count; i ++, start += step) {
            System.out.print(start + " ");
        }
        System.out.println();
    }
}
