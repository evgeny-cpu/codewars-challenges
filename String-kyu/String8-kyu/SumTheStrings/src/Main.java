//Создайте функцию, которая принимает на вход два целых числа в виде строки и выдает их сумму (также в виде строки):
//https://www.codewars.com/kata/5966e33c4e686b508700002d/train/java
public class Main {
    public static void main(String[] args) {

        System.out.println(sumStr("", "5"));
    }

    public static String sumStr(String a, String b) {
        return String.valueOf(Integer.parseInt(a.isEmpty() ? "0" : a) + Integer.parseInt(b.isEmpty() ? "0" : b));
    }
}