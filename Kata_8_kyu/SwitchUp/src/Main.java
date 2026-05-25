//https://www.codewars.com/kata/5808dcb8f0ed42ae34000031/train/java
public class Main {
    public static final String[] NUMBERS = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

    public static void main(String[] args) {


        System.out.println(switchItUp(5));
    }

    public static String switchItUp(int number) {
        return NUMBERS[number];
    }
}