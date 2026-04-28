//https://www.codewars.com/kata/55ccdf1512938ce3ac000056/train/java
public class Main {
    public static void main(String[] args) {

        String n = "Your girlscout cookies are ready to ship. Your total comes to tree fiddy";
        System.out.println(isLockNessMonster(n));
    }

    public static boolean isLockNessMonster(String s) {
     return s.contains("tree fiddy") || s.contains("3.50");
     }

}