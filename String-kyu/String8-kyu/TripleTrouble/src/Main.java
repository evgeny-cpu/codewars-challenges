//Тройная беда
//Создайте функцию, которая будет возвращать строку, объединяющую все буквы трех входных строк в группы. Возьмите первую букву каждой из входных строк и сгруппируйте их рядом друг с другом. Повторите это для каждой буквы (см. пример ниже)!
//Например, ввод: "aa", "bb", "cc" => вывод: "abcabc"
//Примечание: Ожидается, что все входные данные будут одинаковой длины.
//https://www.codewars.com/kata/5704aea738428f4d30000914/train/java
public class Main {
    public static void main(String[] args) {


        System.out.println(tripleTrouble("this", "test", "lock"));
    }

    public static String tripleTrouble(String one, String two, String three) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < one.length(); i++) {
            result.append(one.charAt(i)).append(two.charAt(i)).append(three.charAt(i));
        }
        return result.toString();
    }
}