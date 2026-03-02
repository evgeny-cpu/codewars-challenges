//Напишите функцию, которая принимает массив чисел и возвращает сумму этих чисел. Числа могут быть отрицательными. Если массив пуст, верните значение 0.
//https://www.codewars.com/kata/53dc54212259ed3d4f00071c/train/java

public class Main {
    public static void main(String[] args) {

        double[] numbers = {30, 89, 100, 101};
        System.out.println(sum(numbers));
    }

    public static double sum(double[] numbers) {
        double sum = 0;
        if (numbers.length == 0) {
            return 0;
        }
        for (double d : numbers) {
            sum += d;
        }
        return sum;
    }
}