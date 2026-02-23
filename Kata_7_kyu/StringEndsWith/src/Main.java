//Дополните решение так, чтобы оно возвращало true, если первый переданный аргумент (строка) заканчивается вторым аргументом (также строкой).
//https://www.codewars.com/kata/51f2d1cafc9c0f745c00037d/train/java

public class Main {
    public static void main(String[] args) {

        System.out.println(solution("sumo","omo"));
    }
    public static boolean solution(String str, String ending) {
        return str.endsWith(ending);
    }
}