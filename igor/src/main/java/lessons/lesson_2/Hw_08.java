package lessons.lesson_2;

/*
 * Created by User on 5/14/2017.
 * 8. Переменной типа int передать результат деления двух short, умноженных на результат деления двух byte.
 */
public class Hw_08 {
    public static void main(String[] args) {
        byte b1 = 12;
        byte b2 = 4;
        byte b3 = (byte) (b1 / b2);

        short sh1 = 12;
        short sh2 = 6;
        short sh3 = (short) (sh1 / sh2);

        int i = sh3 * b3;
        System.out.println(i);
    }
}

