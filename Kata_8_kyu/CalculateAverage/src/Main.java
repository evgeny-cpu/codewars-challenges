//Напишите функцию, которая вычисляет среднее арифметическое чисел в заданном массиве.
//Примечание: Пустые массивы должны возвращать 0.
//https://www.codewars.com/kata/57a2013acf1fa5bfc4000921/train/java

public class Main {
    public static void main(String[] args) {

        int[] number = new int[]{};
        System.out.println(findAverage(number));
    }

    public static double findAverage(int[] array) {
        if (array != null && array.length == 0){
            return 0.0;
        }
        double sum = 0;
        for (double d : array) {
            sum += d;
        }
        double average = sum / array.length;
        return average;
    }
}