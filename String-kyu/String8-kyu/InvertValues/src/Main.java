//Дано множество чисел, верните аддитивное обратное каждому из них. Каждое положительное число становится отрицательным, а отрицательные числа становятся положительными.
//https://www.codewars.com/kata/5899dc03bc95b1bf1b0000ad/train/java

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] number = {1, 2, 3, -4, 5};
        System.out.println(Arrays.toString(invert(number)));

    }

    public static int[] invert(int[] array) {
        if (array.length != 0 && array != null) {
            for (int i = 0; i < array.length; i++) {
                array[i] = -array[i];
            }
        }
        return array;
    }
}