package lessons.lesson_2;

/**
 * Created by User on 5/14/2017.
 * 9. Поменять значения двух целочисленных переменных используя третью.
 */
public class Hw_09 {
    public static void main(String[] args) {
        int cola = 2;
        int pepsi = 4;
        int empty;

        empty = cola;
        cola = pepsi;
        pepsi = empty;
        System.out.println(cola);
        System.out.println(pepsi);
    }
}
