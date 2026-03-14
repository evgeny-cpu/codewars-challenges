import java.util.Arrays;

//Kata Task
//I have a cat and a dog.
//I got them at the same time as kitten/puppy. That was humanYears years ago.
//Return their respective ages now as [humanYears,catYears,dogYears]
//https://www.codewars.com/kata/5a6663e9fd56cb5ab800008b/train/java
public class Main {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(humanYearsCatYearsDogYears(10)));
    }

    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int catYear = 0;
        int dogYear = 0;
        for (int i = 1; i <= humanYears; i++) {
            catYear += i == 1 ? 15 : i == 2 ? 9 : 4;
            dogYear += i == 1 ? 15 : i == 2 ? 9 : 5;

        }
        return new int[]{humanYears, catYear, dogYear};
    }
}