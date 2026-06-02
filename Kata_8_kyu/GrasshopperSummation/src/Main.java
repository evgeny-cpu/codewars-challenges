import java.util.stream.IntStream;

//https://www.codewars.com/kata/55d24f55d7dd296eb9000030/train/java
public class Main {
    public static void main(String[] args) {


        System.out.println(summation(8));
    }
    public static int summation(int n) {
        return IntStream.rangeClosed(1,n).sum();
    }
}