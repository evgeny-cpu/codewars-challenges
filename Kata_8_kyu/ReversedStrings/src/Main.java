public class Main {
    public static void main(String[] args) {
        System.out.println(solution("Hello"));

    }

    public static String solution(String str) {
        StringBuilder builder = new StringBuilder(str);
        return builder.reverse().toString();

    }
}