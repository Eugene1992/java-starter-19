package cw_03;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();
        String s = scan.next();

        System.out.println(i);
        System.out.println(s);
    }
}
