//Вам даны два внутренних угла (в градусах) треугольника.
//Напишите функцию, которая возвращает 3-й результат.
//Примечание: будут проверяться только положительные целые числа.
//https://www.codewars.com/kata/5a023c426975981341000014/train/java
public class Main {
    public static void main(String[] args) {

        System.out.println(otherAngle(45,12));
    }
    public static int otherAngle(int angle1, int angle2) {
        return 180 - (angle1 + angle2);
    }
}