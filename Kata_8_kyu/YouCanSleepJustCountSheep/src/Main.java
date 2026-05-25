//Если не можешь уснуть, просто посчитай овец!
//Задача:
//Если задано неотрицательное целое число, 3например, верните строку с шепотом: "1 sheep...2 sheep...3 sheep...".
// Входные данные всегда будут допустимыми, то есть не будут содержать отрицательных целых чисел.
//https://www.codewars.com/kata/5b077ebdaf15be5c7f000077/train/java

public class Main {
    public static void main(String[] args) {

        System.out.println(countingSheep(5));
    }
    public static String countingSheep(int num) {
        String result = "";
        for (int i = 1; i <= num; i ++){
            result += i + " sheep...";

        }
        return result;
    }
}