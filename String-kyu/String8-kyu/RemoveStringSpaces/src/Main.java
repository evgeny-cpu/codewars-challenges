// Напишите функцию, которая удаляет пробелы из строки, а затем возвращает результирующую строку.
//https://www.codewars.com/kata/57eae20f5500ad98e50002c5/train/java

public class Main {
    public static void main(String[] args) {

        System.out.println(noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"));

    }
    public static String noSpace(final String x) {
        return x.replaceAll("\\s","");
    }
}
