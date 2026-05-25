import java.util.Arrays;

//https://www.codewars.com/kata/578aa45ee9fd15ff4600090d/train/java
public class Main {
    public static void main(String[] args) {

        int[] result = sortArray(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0});
        Arrays.stream(result).forEach(System.out::println);
    }

    public static int[] sortArray(int[] array) {
        int[] number = Arrays.stream(array)
                .filter(s -> s % 2 != 0)
                .sorted()
                .toArray();

        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = number[index++];
            }
        }
        return array;
    }
}