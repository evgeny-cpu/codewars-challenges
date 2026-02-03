//Дополните решение так, чтобы оно переворачивало все слова в переданной строке.
//Слова разделены ровно одним пробелом, пробелов в начале и в конце нет.
//https://www.codewars.com/kata/51c8991dee245d7ddf00000e/train/java
public class Main {
    public static void main(String[] args) {

        System.out.println(reverseWords("row row row your boat"));
    }

    public static String reverseWords(String str) {
        String result = "";
        String[] s = str.split(" ");
       for (int i = s.length -1; i >= 0;  i --){
           result += s[i] + (i > 0? " " : "");
       }
        return result;
    }
}