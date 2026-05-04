import java.util.stream.Collectors;
//https://www.codewars.com/kata/54ba84be607a92aa900000f1/train/java
public class Main {
    public static void main(String[] args) {

        System.out.println(isIsogram("moOse"));

    }
    public static boolean  isIsogram(String str) {
        return str.length() == (int) str.toLowerCase().chars().distinct().count();
    }
}