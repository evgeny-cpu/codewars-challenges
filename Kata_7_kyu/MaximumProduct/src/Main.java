//Задача
//Дан массив целых чисел. Найдите максимальное произведение, полученное при умножении двух соседних чисел в массиве. Обратите внимание, что размер массива не менее 2 и содержит смесь положительных, отрицательных целых чисел, а также нулей.
//https://www.codewars.com/kata/5a4138acf28b82aa43000117/train/java

public class Main {
    public static void main(String[] args) {

        int[] number = {1, 5, 10, 9};
        System.out.println(adjacentElementsProduct(number));
    }

    public static int adjacentElementsProduct(int[] array) {
        if (array == null || array.length < 1) {
            return 0;
        }
        int sum = array[0] * array[1];
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] * array[i + 1] > sum){
                sum = array[i] * array[i + 1];
            }
        }
        return sum;
    }
}