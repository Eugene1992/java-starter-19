package cw_08;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Hello world!";

        System.out.println(str.equals("Hello world!"));
        System.out.println(str.equals("Hello world!!"));

        System.out.println(str.compareTo("Abba"));

        char c = str.charAt(6);
        System.out.println(c);

        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

        System.out.println(str.contains("world"));
        System.out.println(str.contains("Earth"));

        String substring = str.substring(2, 6);
        System.out.println(substring);

        System.out.println(str.startsWith("Hell"));
        System.out.println(str.startsWith("Hey"));

        System.out.println(str.endsWith("orld!"));

        System.out.println(str.indexOf('H'));
        System.out.println(str.lastIndexOf('l'));

        System.out.println(str.length());

        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        System.out.println(" Hey yo!      ".trim());
    }
}
