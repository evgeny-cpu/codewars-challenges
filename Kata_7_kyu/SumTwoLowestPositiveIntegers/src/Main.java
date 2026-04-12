import java.util.Arrays;

//Создайте функцию, которая возвращает сумму двух наименьших положительных чисел, получив на вход массив как минимум из 4 положительных целых чисел. Числа с плавающей запятой и неположительные целые числа передаваться не будут.
//В Java эти целые числа будут иметь двойную точность (long).
//Например, если в качестве параметра передается массив [19, 5, 42, 2, 77], то на выходе должно быть 7.
//[10, 343445353, 3453445, 3453545353453]должно вернуться 3453455
//https://www.codewars.com/kata/558fc85d8fd1938afb000014/train/java
public class Main {
    public static void main(String[] args) {

        long [] numbers = new long[]{5,  8, 12, 19, 22};
        System.out.println(sumTwoSmallestNumbers(numbers));
    }

    public static long sumTwoSmallestNumbers(long[] numbers) {
        Arrays.sort(numbers);
        return numbers[0] + numbers[1];
    }
}