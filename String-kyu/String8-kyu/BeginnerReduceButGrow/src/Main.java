import java.util.Arrays;

//Given a non-empty array of integers, return the result of multiplying the values together in order. Example:
//https://www.codewars.com/kata/57f780909f7e8e3183000078/train/java
public class Main {
    public static void main(String[] args) {

        int[] value = {2,2,2,2,2,2};
        System.out.println(grow(value));
    }

    public static int grow(int[] x) {
        int sum = 1;
        for (int i : x) {
            sum *= i;
        }
        return sum;

    }
}