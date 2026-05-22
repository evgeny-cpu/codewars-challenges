import java.util.stream.IntStream;

//https://www.codewars.com/kata/55ecd718f46fba02e5000029/train/java
public class Main {
    public static void main(String[] args) {

        int[] number = between(1,5);
        for (int i : number){
            System.out.println(i);
        }
    }
    public static int[] between(int a, int b) {
        return IntStream.rangeClosed(a,b).toArray();
    }
}