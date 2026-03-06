//Дан треугольник из последовательных нечётных чисел:
//https://www.codewars.com/kata/55fd2d567d94ac3bc9000064/train/java

public class Main {
    public static void main(String[] args) {
        System.out.println(rowSumOddNumbers(42));

    }

    public static int rowSumOddNumbers(int n) {
        return (int)Math.pow(n,3);
    }
}