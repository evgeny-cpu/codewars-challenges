//Создайте функцию, которая отвечает на вопрос "Вы играете на банджо?".
//Если ваше имя начинается с буквы "R" или строчной "r", значит, вы играете на банджо!
//Функция принимает в качестве единственного аргумента имя и возвращает одну из следующих строк:
//https://www.codewars.com/kata/53af2b8861023f1d88000832/train/java


public class Main {
    public static void main(String[] args) {

        System.out.println(areYouPlayingBanjo("rolf"));
    }

    public static String areYouPlayingBanjo(String name) {
        return name.toLowerCase().charAt(0) == 'r' ? name + " plays banjo" : name + " does not play banjo";
    }
}
