//https://www.codewars.com/kata/51675d17e0c1bed195000001/train/java
public class Main {
    public static void main(String[] args) {

        System.out.println(solve("1234567890"));
    }

    public static int solve(final String digits) {
        int x = 0;
        for (int i = 0; i <= digits.length() - 5; i++) {
            int y = Integer.parseInt(digits.substring(i, i + 5));
            if (y > x) {
                x = y;
            }
        }
        return x;
    }
}