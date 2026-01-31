//Нам нужна функция, которая может преобразовывать число (целое число) в строку.
//Какие способы достижения этой цели вам известны?
//https://www.codewars.com/kata/5265326f5fda8eb1160004c8/train/java

public class Main {
    public static void main(String[] args) {

        System.out.println(numberToString(123));
    }

    public static String numberToString(int num) {
        return String.valueOf(num);
    }
}