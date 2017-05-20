package cw_04;

import java.util.Scanner;

/*
 Создать программу, проверяющую и сообщающую на экран, является ли введенное с
 консоли целое число, чётным либо нечётным
 */
public class TestingSomething {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int i = scan.nextInt();

            if (i % 4 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Uneven");
            }
        }
    }

