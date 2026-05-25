import java.util.Arrays;
//Given an array of integers.
//Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers. 0 is neither positive nor negative.
//If the input is an empty array or is null, return an empty array.
//https://www.codewars.com/kata/576bb71bbbcf0951d5000044/train/java
public class Main {
    public static void main(String[] args) {
        int[] x = {0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14};


        System.out.println(Arrays.toString(countPositivesSumNegatives(x)));

    }

    public static int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length < 1) {
            return new int[0];
        }
        int[] sum = new int[2];
        int count = 0;
        for (int i : input) {
            sum[0] += i > 0 ? count + 1 : 0;
            sum[1] += i < 0 ? i : 0;
        }
        return sum;
    }
}