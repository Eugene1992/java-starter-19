package lessons.lesson_3;

import java.util.Scanner;

/*
 Задание 2
 Создать программу, проверяющую и сообщающую на экран, является ли введенное с
 консоли целое число, чётным либо нечётным.
 */
public class Hw_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();

//        if (i % 2 == 0) {
//            System.out.println("Even");
//        } else  {
//            System.out.println("Uneven");
//        }
        if (i % 2 == 0) {
            System.out.println("Even");
        } else if (i % 2 != 0) {
            System.out.println("Uneven");
        } else if (i!=i){
            System.out.println("this is not good");
        }
    }
}
