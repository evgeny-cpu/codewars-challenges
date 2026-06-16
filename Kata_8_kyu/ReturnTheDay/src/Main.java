//https://www.codewars.com/kata/59dd3ccdded72fc78b000b25/train/java
public class Main {
    public static final String[] DAY = {"Wrong, please enter a number between 1 and 7", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    public static void main(String[] args) {


        System.out.println(getDay(5));
    }

    public static String getDay(int n) {
        return n >= DAY.length ? DAY[0] : DAY[n];
    }
}