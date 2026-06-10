//https://www.codewars.com/kata/5b73fe9fb3d9776fbf00009e/train/java
public class Main {
    public static void main(String[] args) {

        System.out.println(sumOfDifferences(new int[]{2, 1, 10}));
    }

    public static int sumOfDifferences(int[] arr) {
        if (arr.length <= 1) {
            return 0;
        }
        int max = arr[0];
        int min = arr[0];
        for (int i : arr){
            if (i > max) max = i;
            if (i < min) min = i;
        }
        return max - min;
    }
}