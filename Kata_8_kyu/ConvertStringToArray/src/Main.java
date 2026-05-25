//Напишите функцию для разделения строки и преобразования её в массив слов.
//https://www.codewars.com/kata/57e76bc428d6fbc2d500036d/train/java
public class Main {
    public static void main(String[] args) {

        System.out.println(stringToArray("Robin Singh"));
    }
    public static String[] stringToArray(String s) {
         String[] message = s.split(" ");
        return message;
    }
}