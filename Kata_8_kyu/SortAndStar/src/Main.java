import java.util.Arrays;
//Вам будет предоставлен список строк. Вы должны отсортировать его в алфавитном порядке (с учетом регистра и на основе ASCII-значений символов), а затем вернуть первое значение.
//Возвращаемое значение должно быть строкой, и "***"между каждой буквой должна быть определенная фраза.
//Не следует удалять или добавлять элементы из/в массив.
//https://www.codewars.com/kata/57cfdf34902f6ba3d300001e/train/java
public class Main {
    public static void main(String[] args) {

        String[] words = new String[]{"bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps"};
        System.out.println(twoSort(words));
    }
    public static String twoSort(String[] s) {
        Arrays.sort(s);
        String words = s[0];
        return String.join("***",words.split(""));
    }
}