import java.util.List;

//Квадратная строка — это последовательность строк n, каждая подстрока которой состоит nиз символов. Нам даны две n-квадратные строки.
//Например:
//s1 = "abcd\nefgh\nijkl\nmnop"
//s2 = "qrst\nuvwx\nyz12\n3456"
//Давайте создадим новую строку strngразмера (n + 1) x nследующим образом:
//Первая строка strngсодержит первый символ первой строки s1 плюс символы последней строки s2.
//Вторая строка strngсодержит первые два символа второй строки s1 плюс символы предпоследней строки s2, за исключением последнего символа.
//и так далее, пока n-я строка strngне будет содержать n символов n-й строки s1 плюс первый символ
//https://www.codewars.com/kata/56f253dd75e340ff670002ac/train/java
public class Main {
    public static void main(String[] args) {

        String s1 = "abcd\nefgh\nijkl\nmnop";
        String s2 = "qrst\nuvwx\nyz12\n3456";
        System.out.println(compose(s1,s2));
    }

    public static String compose(String s1, String s2) {
        String[] a = s1.split("\n");
        String[] b = s2.split("\n");
        int n = a.length;
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            String p1 = a[i].substring(0, i + 1);
            String p2 = b[ n - 1 - i].substring(0,n - i);
            result[i] = p1 + p2;
        }
        return String.join("\n", result);
    }
}