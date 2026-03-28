import java.util.Collections;
import java.util.TreeSet;

//Принимает 2 строки s1, s2содержащие только буквы от aдо z. Возвращает новую отсортированную строку (в алфавитном порядке по возрастанию), максимально длинную, содержащую различные буквы — каждая из которых взята только один раз — из s1 или s2.
//https://www.codewars.com/kata/5656b6906de340bd1b0000ac/train/java
public class Main {
    public static void main(String[] args) {


        System.out.println(longest("aretheyhere", "yestheyarehere"));
    }

    public static String longest(String s1, String s2) {
        StringBuilder str = new StringBuilder();
        TreeSet<String> result = new TreeSet<>();
        Collections.addAll(result, s1.split(""));
        Collections.addAll(result, s2.split(""));

        for (String s : result) {
            str.append(s);
        }
        return str.toString();
    }
}