//https://www.codewars.com/kata/55cbc3586671f6aa070000fb/train/java
public class Main {
    public static void main(String[] args) {


        System.out.println(checkForFactor(10,2));
    }
    public static boolean checkForFactor(int base, int factor) {
        return base % factor == 0;
    }
}