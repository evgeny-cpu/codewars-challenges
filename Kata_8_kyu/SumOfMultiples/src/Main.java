//Ваша работа
//Найдите сумму всех кратных приведенных n ниже чисел.m
//Иметь в виду
//nи m должны быть натуральными числами (положительными целыми числами). В противном случае, обратитесь к примерам на вашем языке программирования о том, как обрабатывать недопустимые входные значения.
//m исключен из числа кратных
//https://www.codewars.com/kata/57241e0f440cd279b5000829/train/java
public class Main {
    public static void main(String[] args) {


        System.out.println(sumMul(2, 9));

    }

    public static long sumMul(int n, int m) {
        if (n < 1 || m < 1) {
            throw new IllegalArgumentException("вай вай вай");
        }
        int sum = 0;
        for (int i = 0; i < m; i += n) {
            sum += i;
        }
        return sum;
    }
}