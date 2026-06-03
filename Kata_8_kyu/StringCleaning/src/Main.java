//https://www.codewars.com/kata/57e1e61ba396b3727c000251/train/java
public class Main {
    public static void main(String[] args) {

        System.out.println(stringClean("(E3at m2e2!!)"));
    }
    static String stringClean(final String text) {
        return text.replaceAll("[0-9]","");
    }
}