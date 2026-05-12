//https://www.codewars.com/kata/58649884a1659ed6cb000072/train/java
public class Main {
    public static void main(String[] args) {

        System.out.println(updateLight("red"));

    }
    public static String updateLight(String current) {
        if (current.equals("green")) return "yellow";
        if  (current.equals("yellow")) return "red";
        if (current.equals("red")) return "green";
        return "";
    }
}