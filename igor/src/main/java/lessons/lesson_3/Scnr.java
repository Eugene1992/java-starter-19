package lessons.lesson_3;

import java.util.Scanner;

class Test {
    public static void main(String args[]) {
//        System.out.print("Введите любое целое число от 1 до 10: ");
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int i = scan.nextInt();
        int firstNumber = scan.nextInt();
        int secondNumber = scan.nextInt();
        System.out.println("Вы ввели число " + i);
    }
}
