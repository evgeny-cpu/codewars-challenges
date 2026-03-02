//Вам будет предоставлена ​​непустая строка. Ваша задача — вернуть средний (средние) символы этой строки.
//Если длина строки нечетная, верните средний символ.
//Если длина строки четная, верните два средних символа.
//https://www.codewars.com/kata/56747fd5cb988479af000028/train/java

public class Main {
    public static void main(String[] args) {

        System.out.println(getMiddle("A"));


    }

    public static String getMiddle(String word) {
        return word.length() % 2 == 0 ? word.substring(word.length() / 2 - 1, word.length() / 2 + 1) : word.substring(word.length() / 2, word.length() / 2 + 1);
    }
}