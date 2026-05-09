import java.util.Arrays;

//https://www.codewars.com/kata/57f609022f4d534f05000024/train/java
public class Main {
    public static void main(String[] args) {


        System.out.println(stray(new int[]{1, 2, 2, 1, -10, -11, -10}));
    }

    static int stray(int[] numbers) {
        return Arrays.stream(numbers).reduce(0, (a, b) -> a ^ b);
    }
}