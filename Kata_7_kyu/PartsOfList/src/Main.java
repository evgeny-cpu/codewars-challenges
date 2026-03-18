import java.util.Arrays;

//Напишите функцию partlist, которая определяет все способы разделения списка (массива), содержащего не менее двух элементов, на две непустые части.
//Каждые две непустые части будут представлять собой пару (или массив для языков без кортежей или struct в C - см. примеры тестовых случаев - ).
//Каждая часть будет представлять собой цепочку.
//Элементы пары должны располагаться в том же порядке, что и в исходном массиве.
//https://www.codewars.com/kata/56f3a1e899b386da78000732/train/java
public class Main {
    public static void main(String[] args) {

        String[] message = {"cdIw", "tzIy", "xDu", "rThG"};
        String[][] message1 = partlist(message);
        for (String[] s: message1 ){
            for (String s1 : s){
                System.out.println(s1);
            }
            System.out.println();
        }
    }

    public static String[][] partlist(String[] arr) {
        String[][] result = new String[arr.length - 1][2];

        for (int i = 0; i < arr.length - 1; i++) {
            String s1 = String.join(" ", Arrays.copyOfRange(arr, 0, i + 1));
            String s2 = String.join(" ", Arrays.copyOfRange(arr, i + 1, arr.length ));
            result[i][0] = s1;
            result[i][1] = s2;
        }
        return result;
    }
}