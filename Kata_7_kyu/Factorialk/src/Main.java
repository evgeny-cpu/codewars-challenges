import java.util.stream.LongStream;

//https://www.codewars.com/kata/57a049e253ba33ac5e000212/train/java
public class Main {
    public static void main(String[] args) {


        System.out.println(factorial(5));
    }

    public static long factorial(int n) {
        return n < 0 || n > 20 ? 0 : LongStream.rangeClosed(1, n).reduce(1, (a, b) -> a * b);
    }


}