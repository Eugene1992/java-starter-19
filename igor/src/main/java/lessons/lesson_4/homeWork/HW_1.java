package lessons.lesson_4.homeWork;

/*
 1. Создайте программу, выводящую на экран все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….
 */
public class HW_1 {
    public static void main(String[] args) {
        System.out.println("Version #1");
        for (int i = 1000; i < 10000; i += 3) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nVersion #2");
        int a = 1000;
        while (a < 10000) {
            System.out.print(a + " ");
            a += 3;
        }
    }
}
