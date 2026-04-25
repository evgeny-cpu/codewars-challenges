import org.apache.commons.lang3.tuple.Pair;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

//Подсчитайте количество вхождений каждого символа и верните результат в виде списка кортежей в порядке их появления. В случае пустого вывода верните пустой список.
//Для получения точной информации о реализации структуры данных в зависимости от используемого языка программирования обратитесь к настройкам решения.
//https://www.codewars.com/kata/57a6633153ba33189e000074/train/java
public class Main {
    public static void main(String[] args) {

        System.out.println(orderedCount("abracadabra"));


    }

    public static List<Pair<Character, Integer>> orderedCount(String text) {
        return text.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        c -> c,
                        LinkedHashMap::new,
                        Collectors.summingInt(c -> 1)
                ))
                .entrySet()
                .stream()
                .map(entry -> Pair.of(entry.getKey(), entry.getValue()))
                .toList();
    }
}
