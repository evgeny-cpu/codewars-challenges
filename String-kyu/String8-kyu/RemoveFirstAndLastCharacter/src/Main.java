// Удалить первый и последний символ
// Задача
// Ваша задача — написать функцию, которая удаляет первый и последний символы строки. Вам дан один параметр — исходная строка.
// Важно: Ваша функция должна обрабатывать строки, состоящие из любых length ≥ 2символов. Для строк, содержащих ровно 2символов, возвращайте пустую строку.
// https://www.codewars.com/kata/56bc28ad5bdaeb48760009b0/train/java
public class Main {
    public static void main(String[] args) {

        System.out.println(remove("22"));

    }

    public static String remove(String str) {
        return str.substring(1, str.length() - 1);
    }
}