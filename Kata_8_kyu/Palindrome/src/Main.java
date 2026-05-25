public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));

    }

    public static Boolean isPalindrome(String x) {
     String s = new StringBuilder(x).reverse().toString();
     return  s.equalsIgnoreCase(x);
    }
}