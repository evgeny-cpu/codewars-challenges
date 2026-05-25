import java.util.Arrays;

//https://www.codewars.com/kata/577a98a6ae28071780000989/train/java
public class Main {
    public static void main(String[] args) {

        int [] number = {-52, 56, 30, 29, -54, 0, -110};
        System.out.println("Максимальная сумма: " + max(number));
        System.out.println("Минимальная сумма: " + min(number));

    }
    public static int min(int[] list) {
        return Arrays.stream(list).min().getAsInt();
    }

    public static int max(int[] list) {
        return Arrays.stream(list).max().getAsInt();
    }
}