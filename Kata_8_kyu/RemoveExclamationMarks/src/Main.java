//Напишите функцию RemoveExclamationMarks, которая удаляет все восклицательные знаки из заданной строки.
//https://www.codewars.com/kata/57a0885cbb9944e24c00008e/train/java
public class Main {
    public static void main(String[] args) {

        System.out.println(removeExclamationMarks("Hello World!"));
    }
    static String removeExclamationMarks(String s) {
        return s.replaceAll("!","");
    }
}