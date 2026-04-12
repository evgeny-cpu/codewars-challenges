//Вы спрашиваете маленькую девочку: «Сколько тебе лет?» Она всегда отвечает: «x лет», где x— случайное число от 0до 9.
//Напишите программу, которая возвращает возраст девочки (от 0 до 9) в виде целого числа.
//Предположим, что входная строка теста всегда является допустимой. Например, входная строка может быть "1 year old" или "5 years old". Первый символ в строке всегда является числом.
//https://www.codewars.com/kata/557cd6882bfa3c8a9f0000c1/train/java
public class Main {
    public static void main(String[] args) {

        System.out.println(howOld("5 years old"));
    }

    public static int howOld(final String herOld) {
        return Integer.parseInt(herOld.replaceAll("[^0-9]",""));
    }
}