//https://www.codewars.com/kata/568dcc3c7f12767a62000038/train/java
public class Main {
    public static void main(String[] args) {


        System.out.println(setAlarm(false, false));


    }

    public static boolean setAlarm(boolean employed, boolean vacation) {
        return employed && !vacation ;
    }

}