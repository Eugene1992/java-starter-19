package lessons.lesson_two;

/*
 7. Передать переменной типа byte результат суммы двух переменных типа short, деленных на третью переменную типа byte.
 */
public class Hw_07 {
    public static void main(String[] args) {
        byte b1 = 2;
        byte b2 = 4;
        byte b3 = (byte) (b1 + b2);

        short sh1 = 2;
        short sh2 = 6;
        short sh3 = (short) (sh1 + sh2);
        System.out.println(sh3);

        byte b4 = (byte) (sh3 / b3);

    }
}
