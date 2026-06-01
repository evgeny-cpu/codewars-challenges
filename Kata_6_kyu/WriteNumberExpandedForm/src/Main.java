import java.util.ArrayList;
import java.util.List;

//https://www.codewars.com/kata/5842df8ccbd22792a4000245/train/java
public class Main {
    public static void main(String[] args) {


        System.out.println(expandedForm(70304));
    }

    public static String expandedForm(int num) {
        String digit = Integer.toString(num);
        List<String> result = new ArrayList<>();
        for (int i = 0; i < digit.length();i++){
            char c = digit.charAt(i);
            if (c != '0'){
                result.add(c + "0".repeat(digit.length() - i - 1));
            }

        }
        return String.join(" + ",result);
    }

}