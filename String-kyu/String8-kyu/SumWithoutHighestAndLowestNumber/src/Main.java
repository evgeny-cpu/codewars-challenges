//Task
//Sum all the numbers of a given array ( cq. list ), except the highest and the lowest element ( by value, not by index! ).
//The highest or lowest element respectively is a single element at each edge, even if there are more than one with the same value.
//Mind the input validation.
//https://www.codewars.com/kata/576b93db1129fcf2200001e6/train/java
public class Main {
    public static void main(String[] args) {
        int[] number = {6, 2, 1, 8, 10};
        System.out.println(sum(number));
    }

    public static int sum(int[] numbers) {
        if (numbers == null || numbers.length < 3) {
            return 0;
        }
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            max = Math.max(max, numbers[i]);
            min = Math.min(min, numbers[i]);
        }
        return sum - max - min;
    }
}