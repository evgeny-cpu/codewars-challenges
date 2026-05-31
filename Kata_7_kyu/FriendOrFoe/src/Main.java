//https://www.codewars.com/kata/55b42574ff091733d900002f/train/java

import java.util.List;

public class Main {
    public static void main(String[] args) {


        System.out.println(friend(List.of("Ryan", "Kieran", "Jason", "Yous")));
    }

    public static List<String> friend(List<String> x) {
        return x.stream().filter(s -> s.length() == 4).toList();
    }
}