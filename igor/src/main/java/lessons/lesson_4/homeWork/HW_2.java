package lessons.lesson_4.homeWork;

/*
    2. Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
*/
public class HW_2 {
    public static void main(String[] args) {
        System.out.println("Version #1");
        for (int i = 1; i <= 55; i += 2) {
            System.out.print(" " + i);
        }
        System.out.println();
        System.out.println();

        System.out.println("Version #2");
        int a = 1;
        while (a <= 55) {
            System.out.print(" " + a);
            a += 2;
        }
    }
}
