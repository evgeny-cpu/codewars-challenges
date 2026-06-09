//https://www.codewars.com/kata/56606694ec01347ce800001b/train/java
public class Main {
    public static void main(String[] args) {


        System.out.println(isTriangle(7,2,2));
    }

    public static boolean isTriangle(int a, int b, int c) {
        return a < b + c && b < a + c && c < a + b;
    }

}