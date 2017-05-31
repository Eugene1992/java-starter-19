package cw_09;

public class Test {
    public static void main(String[] args) {
        int k = 10;
        System.out.println(k++);
        System.out.println(++k);

        int sum = k++ + 10;
        System.out.println(sum);
        System.out.println(k);
    }
}
