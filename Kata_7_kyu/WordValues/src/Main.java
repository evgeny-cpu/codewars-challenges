//Дана строка "abc", и предположим, что каждая буква в строке имеет значение, равное её позиции в алфавите. В таком случае значение нашей строки будет равно 1 + 2 + 3 = 6. Это означает, что: a = 1, b = 2, c = 3 ... z = 26.
//Вам будет предоставлен список строк, и ваша задача будет заключаться в том, чтобы вернуть значения этих строк, как описано выше, умноженные на позицию каждой строки в списке. В нашем случае позиция начинается с 1.
//["abc", "abc abc"]должно вернуться [6, 24]из-за [ 6 * 1, 12 * 2 ]. Обратите внимание, что пробелы игнорируются.
//"abc"имеет значение 6, а "abc abc"имеет значение 12. Теперь значение в позиции 1умножается на , 1а значение в позиции 2умножается на 2.
//https://www.codewars.com/kata/598d91785d4ce3ec4f000018/train/java

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        String[] text = new String[]{"codewars", "abc", "xyz"};

        System.out.println(Arrays.toString(nameValue(text)));
    }

    public static int[] nameValue(String[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (char c: arr[i].toCharArray()){
                if (c != ' '){
                    sum += (c - 'a' + 1);
                }
                result[i] = sum * (i + 1);
            }
        }
        return result;
    }
}