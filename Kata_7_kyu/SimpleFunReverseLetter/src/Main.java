//https://www.codewars.com/kata/58b8c94b7df3f116eb00005b/train/java
public class Main {
    public static void main(String[] args) {


        System.out.println(reverseLetter("ultr53o?n"));
    }
    public static String reverseLetter(final String str) {
        return new StringBuilder(str.toLowerCase().replaceAll("[^a-z]","")).reverse().toString();
    }
}