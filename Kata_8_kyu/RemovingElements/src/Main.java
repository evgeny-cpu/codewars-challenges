import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        Object[] result = removeEveryOther(new Object[]{"Hello", "Goodbye", "Hello Again"});

        for (Object o : result) {
            System.out.println(o);
        }
    }

    public static Object[] removeEveryOther(Object[] arr) {
        return IntStream.range(0, arr.length)
                .filter(s -> s % 2 == 0)
                .mapToObj( s -> arr[s])
                .toArray();
    }
}