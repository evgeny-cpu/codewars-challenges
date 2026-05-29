import java.util.Arrays;

//https://www.codewars.com/kata/57cebe1dc6fdc20c57000ac9/train/java
public class Main {
    public static void main(String[] args) {

        System.out.println(findShort("bitcoin take over the world maybe who knows perhaps"));
    }

    public static int findShort(String s) {
        return Arrays.stream(s.split(" ")).mapToInt(String::length).min().getAsInt();
    }
}