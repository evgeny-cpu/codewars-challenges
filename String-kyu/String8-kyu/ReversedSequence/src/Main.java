//Создайте функцию, которая возвращает массив целых чисел от n до 1, где n>0.
//Пример: n=5-->[5,4,3,2,1]
//https://www.codewars.com/kata/5a00e05cc374cb34d100000d/train/java

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(reverse(5)));
    }

    public static int[] reverse(int n) {
        int[] number = new int[n];
        for (int i = 0; i < n; i++) {
            number[i] = n - i;
        }
        return number;
    }
}