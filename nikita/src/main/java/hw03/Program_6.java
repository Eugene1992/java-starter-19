package hw03;

import java.util.Scanner;

/**
 * Created by user on 19.05.2017.
 */
public class Program_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число:");
        int num = scan.nextInt();
        String res = "";
        System.out.println("Введите систему исчеления:\n1) Bin\n2) Oct\n3) Hex");
        String numSys = scan.next();

        switch (numSys) {
            case "Bin":
                /*while (num > 0) {
                    res = num % 2 + res;
                    num = num / 2;
                }*/
                for (; num > 0; num = num / 2) {
                    res = num % 2 + res;
                }
                break;

            case "Oct":
                for (; num > 0; num = num / 8) {
                    res = num % 8 + res;
                }
                break;
            case "Hex":
                for (; num > 0; num = num / 16) {
                    res = num % 16 + res;
                }
                break;
            default:
                System.out.println("Ошибка ввода!");
                break;
        }
        System.out.println(res);
    }
}
