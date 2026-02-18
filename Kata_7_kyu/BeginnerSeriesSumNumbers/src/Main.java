//Даны два целых числа aи b, которые могут быть положительными или отрицательными. Найдите сумму всех чисел между и включительно и верните её. Если числа равны, верните a или b.
//Примечание: a и bне упорядочены!
//https://www.codewars.com/kata/55f2b110f61eb01779000053/train/java
public class Main {
    public static void main(String[] args) {

        System.out.println(GetSum(-1,2));
    }

    public static int GetSum(int a, int b) {
         if (a == b) return a;
         return (Math.max(a,b) - Math.min(a, b) + 1) * (Math.max(a,b) + Math.min(a, b)) /2;
    }
}