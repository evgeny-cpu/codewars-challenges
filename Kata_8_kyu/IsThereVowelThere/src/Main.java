//Дана последовательность чисел. Необходимо проверить, являются ли какие-либо из этих чисел кодами символов для строчных
// гласных ( a, e, i, o, u).
//Если это так, измените значение массива на строку, содержащую эту гласную букву.
//input [100,100,116,105,117,121]=>[100,100,116,"i","u",121] output Верните полученный массив.
//https://www.codewars.com/kata/57cff961eca260b71900008f/train/java

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> input = Arrays.asList(100, 100, 116, 105, 117, 121);
        System.out.println(isVow(input));
    }
    public static List<Object> isVow(List<Integer> a) {
        Map<Integer, String> vowelMap = new HashMap<>();
        vowelMap.put(97, "a");
        vowelMap.put(101, "e");
        vowelMap.put(105, "i");
        vowelMap.put(111, "o");
        vowelMap.put(117, "u");

        List<Object> result = new ArrayList<>();
        for (Integer num : a) {
            if (vowelMap.containsKey(num)) {
                result.add(vowelMap.get(num));
            } else {
                result.add(num);
            }
        }
        return result;
    }
}