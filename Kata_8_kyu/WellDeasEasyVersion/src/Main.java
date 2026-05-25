//На каждую удачную идею для ката приходится немало неудачных!
//В этом задании вам нужно проверить предоставленный массив (x) на наличие хороших идей («good») и плохих идей («bad»).
// Если есть одна или две хорошие идеи, верните «Опубликовать!», если больше двух, верните «Чувствую, что это серия!».
// Если хороших идей нет, как это часто бывает, верните «Провал!».
//https://www.codewars.com/kata/57f222ce69e09c3630000212/train/java


public class Main {
    public static void main(String[] args) {
        String[] massage = {"good", "bad", "bad", "bad", "bad", "good", "bad", "bad", "good"};

        System.out.println(well(massage));

    }

    public static String well(String[] x) {
        int good = 0;
        for (String s : x) {
            if (s.equals("good")) {
                good++;
            }
        }
        if (good < 1) {
            return "Fail!";
        }
        return good <= 2 ? "Publish!" : "I smell a series!";
    }
}