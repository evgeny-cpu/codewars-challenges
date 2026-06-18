import java.util.Arrays;

//https://www.codewars.com/kata/57a5b0dfcf1fa526bb000118/train/java
public class Main {
    public static void main(String[] args) {

        int[] number = distinct(new int[]{1, 2, 1, 1, 3, 2});
        for (int i : number) {
            System.out.println(i);
        }
    }

    public static int[] distinct(int[] array) {
        return Arrays.stream(array).distinct().toArray();
    }
}