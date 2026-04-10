import java.util.StringJoiner;

//Вам дана строка nданных, каждая подстрока которой состоит nиз нескольких символов. Например:
//s = "abcd\nefgh\nijkl\nmnop"
//Мы изучим «горизонтальное» и «вертикальное» масштабирование этого квадрата из струн.
//k-горизонтальное масштабирование строки заключается в kмногократном дублировании каждого символа строки (кроме '\n').
//Пример: 2-горизонтальное масштабирование s: => "aabbccdd\neeffgghh\niijjkkll\nmmnnoopp"
//Вертикальное масштабирование строки заключается в vмногократном повторении каждой части строки в квадрате.
//Пример: 2-вертикальное масштабирование s: => "abcd\nabcd\nefgh\nefgh\nijkl\nijkl\nmnop\nmnop"
//Функция scale(strng, k, v)выполнит k-горизонтальное масштабирование и v-вертикальное масштабирование.
//https://www.codewars.com/kata/56ed20a2c4e5d69155000301/train/java
public class Main {
    public static void main(String[] args) {

        System.out.println(scale("abcd\nefgh\nijkl\nmnop", 2, 2));
    }

    public static String scale(String strng, int k, int v) {
        if (strng == null || strng.isEmpty()) {
            return "";
        }
        String[] lines = strng.split("\n");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < lines.length; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (char c : lines[i].toCharArray()) {
                for (int j = 0; j < k; j++) {
                    stringBuilder.append(c);
                }
            }
            for (int j = 0; j < v; j++) {
                result.append(stringBuilder.toString()).append(j < v - 1 || i < lines.length - 1 ? "\n" : "");
            }
        }
        return result.toString();
    }
}