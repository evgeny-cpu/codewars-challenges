import java.util.ArrayList;

//https://www.codewars.com/kata/5648b12ce68d9daa6b000099/train/java
public class Main {
    public static void main(String[] args) {

        ArrayList<int[]> list = new ArrayList<>();
        list.add(new int[]{10, 0});
        list.add(new int[]{3, 5});
        list.add(new int[]{2, 5});

        System.out.println(countPassengers(list));
    }

    public static int countPassengers(ArrayList<int[]> stops) {
        return stops.stream()
                .mapToInt(stop -> stop[0] - stop[1])
                .sum();
    }
}