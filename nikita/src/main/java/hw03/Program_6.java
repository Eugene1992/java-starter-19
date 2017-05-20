package hw03;

import java.util.Scanner;

/**
 * Created by user on 19.05.2017.
 */
public class Program_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = 0;
        System.out.println("Введите систему исчеления:");
        String s = scan.next();
        switch (s) {
            case "Bin":
                break;
            case "Oct":
                break;
            case "Hex":
                break;
            default:
                System.out.println("Ошибка ввода!");
                break;
        }
        System.out.println(s);
    }
}
