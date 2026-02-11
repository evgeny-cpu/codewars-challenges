//Дополните функцию суммы квадратов так, чтобы она возводила в квадрат каждое переданное ей число, а затем суммировала результаты.
//https://www.codewars.com/kata/515e271a311df0350d00000f/train/java

public class Main {
    public static void main(String[] args) {

        int [] x = {5,-3,4};
        System.out.println(squareSum(x));
    }
    public static int squareSum(int[] n) {
        int result = 0;
        for (int i : n){
            result += (int) (Math.pow(i,2));
        }
        return result;
    }
}