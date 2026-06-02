//https://www.codewars.com/kata/57a4d500e298a7952100035d/train/java
public class Main {
    public static void main(String[] args) {

        System.out.println(hexToDec("FF"));
    }
    public static int hexToDec(final String hexString) {
        return Integer.parseInt(hexString,16);
    }
}