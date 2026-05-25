public class Main {
    public static void main(String[] args) {

        // Сокрушение предложений
        // Напишите функцию, которая принимает массив слов, объединяет их в предложение и возвращает это предложение.
        // Вы можете игнорировать необходимость очистки слов или добавления знаков препинания, но между словами следует добавлять пробелы.
        // Будьте внимательны, пробелов не должно быть в начале или в конце предложения!
        // https://www.codewars.com/kata/53dc23c68a0c93699800041d/train/java

        String[] message = {"hello", "world", "this", "is", "great"};
    }

    public static String smash(String[] words) {
        String result = "";
        for (String s : words) {
            result += s + " ";
        }
        return result.trim();
    }
}