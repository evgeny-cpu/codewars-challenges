import java.util.Arrays;
import java.util.stream.IntStream;

//https://www.codewars.com/kata/563cf89eb4747c5fb100001b/train/java
public class Main {
    public static void main(String[] args) {


        int[] number = {2, 2, 1, 2, 1};
        int[] result = removeSmallest(number);

        Arrays.stream(result).forEach(System.out::println);

    }

    public static int[] removeSmallest(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return new int[0];
        }
        int minIndex = IntStream.range(0, numbers.length).reduce((a,b) -> numbers[a] <= numbers[b] ? a : b).getAsInt();

        return IntStream.range(0, numbers.length).filter(i -> i != minIndex).map(i -> numbers[i]).toArray();
    }
}