//В этом задании вы создадите функцию,
// которая принимает список неотрицательных целых чисел и строк и возвращает новый список, из которого будут удалены только строки.
//https://www.codewars.com/kata/53dbd5315a3c69eed20002dd/train/java

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> list = List.of(1, 2, "a", "b");

        System.out.println(filterList(list));
    }

    public static List<Object> filterList(final List<Object> list) {
        List<Object> result = new ArrayList<>();
        for (Object elements : list){
            if (elements instanceof Integer){
                result.add(elements);
            }
        }
        return result;
    }
}