import java.util.stream.Collectors;

//https://www.codewars.com/kata/546f922b54af40e1e90001da/train/java
public class Main {
    public static void main(String[] args) {


        System.out.println(alphabetPosition("20 8 5 19 21 14 19 5 20 19 5 20 19 1 20 20 23 5 12 22 5 15 3 12 15 3 11"));
    }

    static String alphabetPosition(String text) {
        return text.toLowerCase().chars()
                .filter(c -> c >= 'a' &&c <= 'z')
                .mapToObj(c -> String.valueOf(c -96))
                .collect(Collectors.joining(" "));

    }
}