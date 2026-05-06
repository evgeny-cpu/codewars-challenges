import java.util.stream.IntStream;

//https://www.codewars.com/kata/54ff0d1f355cfd20e60001fc/train/java
public class Main {
    public static void main(String[] args) {


        System.out.println(factorial(5));
    }

    public static int factorial(int n) {
        if (n < 0 || n > 12) {
            throw new IllegalArgumentException("Значение в аргументах меньше 0 или больше 12");
        }
        return IntStream.rangeClosed(1, n).reduce(1, (a, b) -> a * b);
    }
}