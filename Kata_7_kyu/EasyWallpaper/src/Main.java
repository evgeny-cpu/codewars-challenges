//Задача
//Ваша функция wallpaper(l, w, h)должна возвращать в виде простого английского слова в нижнем регистре количество рулонов, которые он должен купить.
//https://www.codewars.com/kata/567501aec64b81e252000003/train/java
public class Main {
    public static void main(String[] args) {

        System.out.println(wallpaper(4, 3.5, 3));
    }

    public static String wallpaper(double l, double w, double h) {
        String[] numbers = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty"};
        if (l == 0 || w == 0 || h == 0) {
            return numbers[0];
        }
        double allArea = 2 * (l + w) * h;
        int rollCount = (int) (Math.ceil(allArea * 1.15 / 5.2));
        return numbers[rollCount];
    }
}