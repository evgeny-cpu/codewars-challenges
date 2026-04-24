//В некоторых скриптовых языках, таких как PHP, существует логический оператор (например &&, ||, , and, or, и т. д.), называемый «исключающим ИЛИ» (отсюда и название этой задачи). Исключающее ИЛИ вычисляет два логических значения.
// Затем оно возвращает значение, trueесли истинно ровно одно из двух выражений , falseв противном случае — . Например:
//https://www.codewars.com/kata/56fa3c5ce4d45d2a52001b3c/train/java
public class Main {
    public static void main(String[] args) {


        System.out.println(xor(true,false));
    }

    public static boolean xor(boolean a, boolean b) {
        return a != b;
    }
}