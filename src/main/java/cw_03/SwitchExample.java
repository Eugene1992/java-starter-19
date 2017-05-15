package cw_03;

public class SwitchExample {
    public static void main(String[] args) {

        int k = 100;

        if (k == 10) {
            System.out.println("A");
        } else if (k == 11) {
            System.out.println("B");
        } else if (k == 12) {
            System.out.println("C");
        } else if (k == 13) {
            System.out.println("D");
        } else if (k == 14) {
            System.out.println("E");
        } else if (k == 15) {
            System.out.println("F");
        } else {
            System.out.println(k);
        }

        switch (k) {
            default:
                System.out.println(k);
                break;
            case 10:
                System.out.println("A");
                break;
            case 11:
                System.out.println("B");
                break;
            case 12:
                System.out.println("C");
                break;
            case 13:
                System.out.println("D");
                break;
            case 14:
                System.out.println("E");
                break;
            case 15:
                /*switch (k) {
                    case 10:
                        System.out.println("A");
                        break;
                }*/
                System.out.println("F");
                break;

        }
        System.out.println("End");
    }
}
