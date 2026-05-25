import java.util.Arrays;
import java.util.stream.IntStream;

//https://www.codewars.com/kata/5513795bd3fafb56c200049e/train/java
public class Main {
    public static void main(String[] args) {


        int[] number = countBy(2,5);

        Arrays.stream(number).forEach(System.out::println);

    }

    public static int[] countBy(int x, int n){
        return IntStream.iterate(x, i -> i + x ).limit(n).toArray();
    }
}