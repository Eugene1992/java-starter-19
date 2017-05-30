package cw_08;

public class StringInit {
    public static void main(String[] args) {
        String s1 = "Hello"; // literal style
        String s2 = new String(" world"); // object style
        String s3 = s1 + s2 + "!" + 1 + true; // concatenation
        String s4 = s1.concat(" world!");
    }
}
