import java.util.Arrays;

//https://www.codewars.com/kata/57f781872e3d8ca2a000007e/train/java
public class Main {
    public static void main(String[] args) {

        int[]number = map(new int[]{4,1,1,1,4});
        Arrays.stream(number).forEach(System.out::println);

    }

    public static int[] map(int[] arr) {
        return Arrays.stream(arr).map(i -> i * 2).toArray();
    }
}