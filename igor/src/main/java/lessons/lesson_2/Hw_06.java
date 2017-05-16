package lessons.lesson_2;

//6. Передать переменной типа byte результат суммы двух переменных типа byte.

public class Hw_06 {
    public static void main(String[] args) {
        byte b1 = 2;
        byte b2 = 4;
        byte b3 = (byte) (b1 + b2);
        System.out.println(b3);
        System.out.println();


        int l = 4;
        int j = 9;
        j = j + j;
        j = l + l;
        System.out.println("l= " + l);
        System.out.println("j= " + j);
        System.out.println();

        int a = 2;
        int b = a;
        b = a + b;
        a = b + a;

        System.out.println(b);
        System.out.println(a);
        System.out.println();

        String s = "Hello ";
        String po = "World";
        s = po;
        System.out.println(po);
        System.out.println(s);
        System.out.println(s);

        int h = 15;
        h = h + h;
        System.out.println(h);
        System.out.println();

        byte u = (byte) 129;
        u = (byte) (u + u);
        System.out.println(u);
        System.out.println();

        System.out.println("nvnvn " + (10 > 7));
    }
}
