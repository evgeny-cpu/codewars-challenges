//Создайте функцию, которая проверяет, nделится ли число на два числа x И y . Все входные данные — положительные, ненулевые числа.
//https://www.codewars.com/kata/5545f109004975ea66000086/train/java

public class Main {
    public static void main(String[] args) {

        System.out.println(isDivisible(252, 6, 18));
    }

    public static boolean isDivisible(long n, long x, long y) {
        return n % x == 0 && n % y == 0;
    }
}