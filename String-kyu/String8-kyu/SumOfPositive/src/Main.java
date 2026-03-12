//Task
//You get an array of numbers, return the sum of all of the positives ones.
//https://www.codewars.com/kata/5715eaedb436cf5606000381/train/java
public class Main {
    public static void main(String[] args) {
        int[] x = {-1, -2, -3, -4, -5};
        System.out.println(sum(x));
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i > 0 ? i : 0;
        }
        return sum;
    }
}