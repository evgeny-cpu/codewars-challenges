//https://www.codewars.com/kata/55225023e1be1ec8bc000390/train/java
public class Main {
    public static void main(String[] args) {

        System.out.println(greet("Johnny"));
    }

    public static String greet(String name) {
        return name.equals("Johnny") ? "Hello, my love!" : String.format("Hello, %s!", name);
    }
}
