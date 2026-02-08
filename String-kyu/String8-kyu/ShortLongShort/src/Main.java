//Даны две строки, aи b. Верните строку вида short+long+short, где более короткая строка находится снаружи, а более длинная — внутри.
// Строки не будут одинаковой длины, но могут быть пустыми ( zero.length ).
//Подсказка для пользователей R:
//Длина строки не всегда совпадает с количеством символов.
//https://www.codewars.com/kata/50654ddff44f800200000007/train/java

public class Main {
    public static void main(String[] args) {
        System.out.println(solution("bb", ""));

    }

    public static String solution(String a, String b) {
        return a.length() < b.length() ? a + b + a : b + a + b;
    }
}