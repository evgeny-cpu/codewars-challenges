//Вам даны два массива строк: a1и a2. Каждая строка состоит из букв от aдо z. Пусть x— любая строка из первого массива, а y— любая строка из второго массива.
//Find max(abs(length(x) − length(y)))
//Если a1и/или a2пусты, верните значение -1в любом языке, кроме Haskell (F#), где будет возвращено Nothing(None).
//https://www.codewars.com/kata/5663f5305102699bad000056/train/java
public class Main {
    public static void main(String[] args) {


        System.out.println(mxdiflg(new String[]{"hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"},
                new String[]{"cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"}));

    }


    public static int mxdiflg(String[] a1, String[] a2) {
        if (a1.length == 0 || a2.length == 0) {
            return -1;
        }
        int min1 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE;

        for (String s : a1) {
            min1 = Math.min(min1, s.length());
            max1 = Math.max(max1, s.length());
        }

        int min2 = Integer.MAX_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (String s : a2) {
            min2 = Math.min(min2, s.length());
            max2 = Math.max(max2, s.length());
        }

        int value1 = Math.abs(max2-min1);
        int value2 = Math.abs(max1-min2);

        return Math.max(value1, value2);
    }

}