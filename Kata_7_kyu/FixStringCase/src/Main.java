//В этом задании вам будет дана строка, которая может содержать как заглавные, так и строчные буквы, и ваша задача — преобразовать эту строку либо в текст только в строчные буквы, либо только в заглавные буквы в зависимости от:
//Вносите как можно меньше изменений.
//Если строка содержит одинаковое количество заглавных и строчных букв, преобразуйте строку в строчные.
//https://www.codewars.com/kata/5b180e9fedaa564a7000009a/train/java
public class Main {
    public static void main(String[] args) {


        System.out.println(solve("Code"));

    }
    public static String solve(final String str) {
        char [] c = str.toCharArray();
        int count = 0;
        for (char letter : c){
            if (Character.isUpperCase(letter)){
                count++;
            }
        }
        if (count > str.length() / 2){
            return  str.toUpperCase();
        }

        return str.toLowerCase();

    }
}