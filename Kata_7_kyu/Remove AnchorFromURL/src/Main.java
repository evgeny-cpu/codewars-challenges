//https://www.codewars.com/kata/51f2b4448cadf20ed0000386/train/java
public class Main {
    public static void main(String[] args) {


        System.out.println(removeUrlAnchor("www.codewars.com?page=1"));
    }

    public static String removeUrlAnchor(String url) {
        int x = url.indexOf("#");
        return url.contains("#") ? url.substring(0, x) : url;
    }
}