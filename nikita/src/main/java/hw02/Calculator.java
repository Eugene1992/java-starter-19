package hw02;

import java.util.Scanner;

/**
 * Created by user on 17.05.2017.
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = 0;
        System.out.println("Введите знак арифметической операции");
        String s = scan.next();
        switch (s) {
            default:
                System.out.println("Ошибка ввода!");
                break;
            case "+":
                c = a + b;
                break;
            case "-":
                c = a - b;
                break;
            case "*":
                c = a * b;
                break;
            case "/":
                c = a / b;
                break;
        }
        System.out.println(c);
    }
}
