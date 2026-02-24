//Ваша задача — создать функцию, которая выполняет четыре основные математические операции.
//Функция должна принимать три аргумента: операция (строка/символ), значение 1 (число), значение 2 (число).
//Функция должна возвращать результат в виде чисел после применения выбранной операции.
//Примеры (Оператор, значение1, значение2) --> вывод
//https://www.codewars.com/kata/57356c55867b9b7a60000bd7/train/java
public class Main {
    public static void main(String[] args) {

        System.out.println(basicMath("+",200,100));
    }

    public static Integer basicMath(String op, int v1, int v2) {
        int sum = 0;
        switch (op){
            case "+" -> sum = v1 + v2;
            case "-" -> sum = v1 - v2;
            case "*" -> sum = v1 * v2;
            case "/" -> sum = v1 / v2;
        }
        return sum;
    }
}