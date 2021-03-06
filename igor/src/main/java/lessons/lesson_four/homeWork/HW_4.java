package lessons.lesson_four.homeWork;

/*
 4. Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….
 */
public class HW_4 {
    public static void main(String[] args) {
        System.out.println("Version #1 (for)");
        for (int a = 1, b = 2; a <= 20; a++, b *= 2) {
            System.out.print(b + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println("Version #2 (For + if)");
        int j = 2;
        for (int i = 0; i < 20; i++) {
            System.out.print(j + " ");
            j *= 2;
        }

        System.out.println("\nVersion #3");
        for (int i = 2; i <= 1048576; i *= 2) {
            System.out.print(i + " ");
        }
    }
}