//Получив массив целых чисел в виде строк и цифр, верните сумму значений массива, как если бы все элементы были числами.
//Верните ответ в виде числа.
//https://www.codewars.com/kata/57eaeb9578748ff92a000009/train/java

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Object> list = new ArrayList<>();
        list.add(5);
        list.add("5");
        System.out.println(sum(list));
    }

    public static int sum(List<?> mixed) {
        int sum = 0;
        for (Object s : mixed) {
            sum += Integer.parseInt(s.toString());
        }
        return sum;
    }}