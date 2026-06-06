//https://www.codewars.com/kata/59fca81a5712f9fa4700159a/train/java
public class Main {
    public static void main(String[] args) {


        System.out.println(toBinary(2));
    }


    public static int toBinary(int n) {
        return Integer.parseInt(Integer.toBinaryString(n));
    }
}