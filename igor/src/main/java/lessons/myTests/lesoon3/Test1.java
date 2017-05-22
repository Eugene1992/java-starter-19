package lessons.myTests.lesoon3;

/**
 * Created by User on 5/20/2017.
 */
public class Test1 {
    public static void main(String[] args) {
        int box1 = 4;
        int box2 = 6;
        int box3 = box1 + box2;
        System.out.println(box1);
        System.out.println(box3);
        box3 = box2 - box1;
        System.out.println(box3);
        System.out.println();
        box1 = box2; 

        final int card = 500;
        box3 = card - 5;
        System.out.println(box3);
    }
}
