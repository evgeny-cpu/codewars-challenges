import java.util.stream.IntStream;

//https://www.codewars.com/kata/539ee3b6757843632d00026b/train/java
public class Main {
    public static void main(String[] args) {


        int[] number = capitals("CodEWaRs");
        for (int i : number){
            System.out.println(i);
        }
    }

    public static int[] capitals(String s) {
        return IntStream.range(0,s.length()).filter(i -> Character.isUpperCase(s.charAt(i))).toArray();
    }
}