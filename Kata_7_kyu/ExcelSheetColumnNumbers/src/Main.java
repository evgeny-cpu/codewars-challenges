//Напишите функцию, которая, получив заголовок столбца в формате Excel, возвращает соответствующий номер столбца.
//Все заголовки колонок будут написаны заглавными буквами.
//https://www.codewars.com/kata/55ee3ebff71e82a30000006a/train/java
public class Main {
    public static void main(String[] args) {


        System.out.println(titleToNumber("AA"));
    }

    public static long titleToNumber(String title) {
        long result = 0;
        for (int i = 0; i < title.length(); i++) {
            result = result * 26 + (title.charAt(i) - 'A' + 1);
        }

        return result;
    }

}