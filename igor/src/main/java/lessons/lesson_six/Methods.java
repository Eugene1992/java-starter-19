package lessons.lesson_six;

/**
 * Created by User on 5/22/2017.
 */
public class Methods {
    public static void main(String[] args) {
        human("Igor", 30);
        human("Pavel", 4);

    }

    static void human(String name, int age) {
        System.out.println("My name is " + name + "! I'am " + age + " years old.");
    }
}
