import java.util.stream.IntStream;

//https://www.codewars.com/kata/56b29582461215098d00000f/train/java
public class Main {
    public static void main(String[] args) {

        int[] number = new int[]{-10,1,2,3,5,6,8,9,899};
        int[] result = pipeFix(number);
        for (int i : result){
            System.out.println(i);
        }
    }

    public static int[] pipeFix(int[] numbers) {
        return IntStream.rangeClosed(numbers[0],numbers[numbers.length-1] ).toArray();
    }
}