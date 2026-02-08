//Вам будет предоставлен массив aи значение x. Всё, что вам нужно сделать, это проверить, содержит ли предоставленный массив это значение.
//aМожет содержать числа или строки. x Может быть и тем, и другим.
//Верните значение true, если массив содержит это значение; false в противном случае — нет.
//https://www.codewars.com/kata/57cc975ed542d3148f00015b/train/java

public class Main {
    public static void main(String[] args) {

        Object[] value = new Object[]{"what", "a", "great", "kata"};
        System.out.println(check(value, "kat"));
    }

    public static boolean check(Object[] a, Object x) {
        boolean isTrue = false;
        for (Object c : a) {
            if (c.equals(x)) {
                isTrue = true;
            }
        }
        return isTrue;
    }
}