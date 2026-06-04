//https://www.codewars.com/kata/5808e2006b65bff35500008f/train/java
public class Main {
    public static void main(String[] args) {


        System.out.println(position('b'));
    }

    public static String position(char alphabet) {
        return String.format("Position of alphabet: %d", alphabet - 96);
    }
}