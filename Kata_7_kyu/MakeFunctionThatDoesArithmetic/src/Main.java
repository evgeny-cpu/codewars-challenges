//https://www.codewars.com/kata/583f158ea20cfcbeb400000a/train/java
public class Main {
    public static void main(String[] args) {


        System.out.println(arithmetic(5, 2, "add"));
    }

    public static int arithmetic(int a, int b, String operator) {
        if (operator.equals("add")) return a + b;
        if (operator.equals("subtract")) return a - b;
        if (operator.equals("multiply")) return a * b;
        return a / b;
    }
}