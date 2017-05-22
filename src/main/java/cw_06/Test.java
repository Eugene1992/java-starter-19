package cw_06;

public class Test {
    public static void main(String[] args) {
        printManyTimes(5, "Hello world");

        printManyTimes(10, "Hello CBS students!");

        printManyTimes(7, "Lucky!");

        String name = "Ivan";
        int salary = 10000;
        double bonus = 0.7;

        double bonusValue = calcBonus(salary, bonus);

        System.out.println("Ivan will recieve " + bonusValue + " $ bonus!");
    }

    static void makePlusAndPrint(int a, int b) {
        System.out.println(a + b);
    }

    static void printManyTimes(int num, String str) {
        for (int i = 0; i < num; i++) {
            System.out.println(str);
        }
    }

    static double calcBonus(int salary, double bonus) {
        double result = salary + salary * bonus;
        return result;
    }

}
