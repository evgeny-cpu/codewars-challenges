//Создайте функцию, которая принимает строку и один символ и возвращает целое число, равное количеству вхождений второго аргумента в первый.
//
//0Если совпадений не обнаружено, следует вернуть количество.
//https://www.codewars.com/kata/5865918c6b569962950002a1/train/java

public class Main {
    public static void main(String[] args) {

        System.out.println(strCount("Hello",'l'));
    }
    public static int strCount(String str, char letter) {
        int count = 0;
        for (int i = 0; i < str.length();i++){
            if (letter == str.charAt(i)){
                count++;
            }
        }
        return count;
    }
}