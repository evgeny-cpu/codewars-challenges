import java.util.Arrays;

//https://www.codewars.com/kata/5ac6932b2f317b96980000ca/train/java
public class Main {
    public static void main(String[] args) {


        System.out.println(minValue(new int[]{1, 3, 1}));

    }

    public static int minValue(int[] values) {
        return Arrays.stream(values).distinct().sorted().reduce(0,(a,b) -> a * 10 + b);
    }
}