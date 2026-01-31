//Строка написана заглавными буквами?
//Задача
//Создайте метод для проверки того, написана ли строка ЗАГЛАВНЫМИ БУКВАМИ.
//https://www.codewars.com/kata/56cd44e1aa4ac7879200010b/train/java

public class Main {
    public static void main(String[] args) {
        System.out.println(isUpperCase("hello I AM DONALD"));
    }
    public static boolean isUpperCase(String s) {
        return s.equals(s.toUpperCase());
    }
}