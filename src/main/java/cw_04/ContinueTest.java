package cw_04;

public class ContinueTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 7) continue;
            System.out.print(i + " ");
        }
    }
}
