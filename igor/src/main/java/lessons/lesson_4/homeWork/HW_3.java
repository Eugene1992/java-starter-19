package lessons.lesson_4.homeWork;

/*
 3. Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….
 */
public class HW_3 {
    public static void main(String[] args) {
        System.out.println("Version #1 (while)");
        int a = 90;
        while (a >= 0) {
            System.out.print(a + " ");
            a -= 5;
        }
        System.out.println();
        System.out.println();

        System.out.println("Version #2 (do while)");
        int b = 90;
        do {
            System.out.print(b + " ");
            b -= 5;
        } while (b >= 0);
        System.out.println();
        System.out.println();

        System.out.println("Version #3 (for)");
        for (int i = 90; i >= 0; i -= 5) {
            System.out.print(i + " ");
        }
    }
}
