//Завершите функцию, которая принимает строковый параметр и переворачивает каждое слово в строке. Все пробелы в строке должны быть сохранены.
//https://www.codewars.com/kata/5259b20d6021e9e14c0010d4/train/java
public class Main {
    public static void main(String[] args) {

        System.out.println(reverseWords("The quick brown fox jumps over the lazy dog."));

    }
    public static String reverseWords(final String original) {
        String[] s = original.split(" ",-1);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length; i ++){
            result.append(new StringBuilder(s[i]).reverse().append(i < s.length -1? " " : ""));
        }
        return result.toString();
    }
}