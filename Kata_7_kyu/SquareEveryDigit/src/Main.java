import java.util.stream.Collectors;

//https://www.codewars.com/kata/546e2562b03326a88e000020/train/java
public class Main {
    public static void main(String[] args) {

        System.out.println(squareDigits(9119));
    }
    public static int squareDigits(int n) {
        return Integer.parseInt(
                String.valueOf(n)
                        .chars()
                        .map(Character :: getNumericValue)
                        .map(s -> s * s)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining())
        );
    }
}