import java.util.Arrays;

//https://www.codewars.com/kata/556196a6091a7e7f58000018/train/java
public class Main {
    public static void main(String[] args) {


        System.out.println(largestPairSum(new int[]{10, 14, 2, 23, 19}));

    }

    public static int largestPairSum(int[] numbers) {
        int[] result = numbers.clone();
        Arrays.sort(result);
        return result[result.length - 1] + result[result.length - 2];
    }


}