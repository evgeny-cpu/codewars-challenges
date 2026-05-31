import java.util.Arrays;

//https://www.codewars.com/kata/57ee99a16c8df7b02d00045f/train/java
public class Main {
    public static void main(String[] args) {
        int[] result = flattenAndSort(new int[][]{{111, 999}, {222}, {333}, {444}, {888}, {777}, {666}, {555}});
        for (int i : result){
            System.out.println(i);
        }

    }

    public static int[] flattenAndSort(int[][] array) {
        return Arrays.stream(array).flatMapToInt(Arrays::stream).sorted().toArray();
    }
}