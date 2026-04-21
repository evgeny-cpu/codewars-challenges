import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

//Эта ката — первая из четырёх, посвящённых «Квадратным струнам».
//Вам дана строка n данных, каждая подстрока которой состоит из n нескольких символов: Например:
//s = "abcd\nefgh\nijkl\nmnop"
//Мы изучим некоторые преобразования этого квадрата струн.
//https://www.codewars.com/kata/56dbe0e313c2f63be4000b25/train/java
public class Main {
    public static void main(String[] args) {

        String s = "hSgdHQ\nHnDMao\nClNNxX\niRvxxH\nbqTVvA\nwvSyRu";
        String r = "QHdgSh\noaMDnH\nXxNNlC\nHxxvRi\nAvVTqb\nuRySvw";

        System.out.println(oper(Main::vertMirror,s));
        System.out.println();
        System.out.println(oper(Main::horMirror,r));


    }

    public static String vertMirror(String strng) {
      return Arrays.stream(strng.split("\n"))
              .map(s -> new StringBuilder(s).reverse().toString())
              .collect(Collectors.joining("\n"));
    }

    public static String horMirror(String strng) {
        List<String> lines = Arrays.asList(strng.split("\n"));
        Collections.reverse(lines);
        return String.join("\n", lines);
    }

    public static String oper(Function<String, String> operator, String s) {
        return operator.apply(s);
    }
}