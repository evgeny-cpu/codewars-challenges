//https://www.codewars.com/kata/578553c3a1b8d5c40300037c/train/java

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        System.out.println(ConvertBinaryArrayToInt(Arrays.asList(1, 0, 0, 1)));

    }

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        int x = 0;
        for (int i : binary){
            x = (x << 1) | i;
        }
        return x;
    }
}