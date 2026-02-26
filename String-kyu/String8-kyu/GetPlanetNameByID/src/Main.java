//Функция возвращает некорректные значения. Можете ли вы выяснить причину?
//Пример ( Вход --> Выход ):
//https://www.codewars.com/kata/515e188a311df01cba000003/train/java

public class Main {
    public static void main(String[] args) {

        System.out.println(getPlanetName(1));

    }
    static String getPlanetName(int id) {
        String name = null;
        switch (id) {
            case 1 -> name = "Mercury";
            case 2 -> name = "Venus";
            case 3 -> name = "Earth";
            case 4 -> name = "Mars";
            case 5 -> name = "Jupiter";
            case 6 -> name = "Saturn";
            case 7 -> name = "Uranus";
            case 8 -> name = "Neptune";
        }
        return name;
    }
}