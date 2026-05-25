//Реализуйте функцию, которая преобразует заданное логическое значение в его строковое представление.
//Примечание: Будут предоставлены только корректные данные.
//https://www.codewars.com/kata/551b4501ac0447318f0009cd/train/java

public class Main {
    public static void main(String[] args) {

        System.out.println(convert(true));

    }
    public static String convert(boolean b) {
        return b? "true":"false";
    }
}