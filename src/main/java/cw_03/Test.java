package cw_03;

public class Test {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a * b; // a = 200
        b = a / b; // b = 10
        a = a / b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println(10 % 4);
    }
}
