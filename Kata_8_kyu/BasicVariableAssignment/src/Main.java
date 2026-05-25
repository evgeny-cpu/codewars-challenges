//Этот код должен сохранять значение "codewa.rs"в переменную с таким же именем, nameно это не работает. Можете ли вы выяснить, почему?
//https://www.codewars.com/kata/50ee6b0bdeab583673000025/train/java
public class Main {
    public static String a = "code";
    public static String b = "wa.rs";
    public static String name = a + b;
    public static void main(String[] args) {

        System.out.println(name);
    }
}