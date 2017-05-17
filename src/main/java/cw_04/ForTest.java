package cw_04;

public class ForTest {
    public static void main(String[] args) {
//      for (counter init; condition; counter++\--)

        for (int counter = 1; counter < 100; counter += 2) {
            System.out.print(counter + " ");
        }

        int counter = 1;
        while (counter < 100) {
            System.out.print(counter + " ");
            counter += 2;
        }
    }
}
