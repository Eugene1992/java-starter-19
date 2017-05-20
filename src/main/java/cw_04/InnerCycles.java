package cw_04;

public class InnerCycles {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            System.out.println("\ni = " + i);
            for (int j = 0; j < 10; j++) {
                System.out.print("j = " + j + ", ");
                Thread.sleep(1000);
            }
        }
    }
}
