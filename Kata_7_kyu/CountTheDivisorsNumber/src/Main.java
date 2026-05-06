import java.util.stream.IntStream;

//https://www.codewars.com/kata/542c0f198e077084c0000c2e/train/java
public class Main {
    public static void main(String[] args) {


        System.out.println(numberOfDivisors(30));
    }

    public static long numberOfDivisors(int n) {
        return IntStream.range(1, n + 1).filter(i -> n % i == 0).count();
    }
}