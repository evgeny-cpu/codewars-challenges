import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

//https://www.codewars.com/kata/55c45be3b2079eccff00010f/train/java
public class Main {
    public static void main(String[] args) {


        System.out.println(order("is2 Thi1s T4est 3a"));


    }

    public static String order(String words) {
        return words == null || words.isEmpty() ? "" : Arrays.stream(words.split(" "))
                .sorted(Comparator.comparing(word -> word.replaceAll("\\D", ""))).collect(Collectors.joining(" "));
    }

}