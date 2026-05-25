//Завершите функцию, которая преобразует двоичное число (заданное в виде строки) в десятичное число.
//https://www.codewars.com/kata/57a5c31ce298a7e6b7000334/train/java
public class Main {
    public static void main(String[] args) {


        System.out.println(binToDecimal("1001001"));
    }
    public static int binToDecimal(String inp){
        return Integer.parseInt(inp,2);
    }
}