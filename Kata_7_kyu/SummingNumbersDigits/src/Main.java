//https://www.codewars.com/kata/52f3149496de55aded000410/train/java
public class Main {
    public static void main(String[] args) {

        System.out.println(sumDigits(1234567890));
    }

    public static int sumDigits(int number) {
        int numb = Math.abs(number);
        int result = 0;

        while (numb > 0) {
            int x = numb % 10;
            result += x;
            numb /= 10;
        }
        return result;
    }
}