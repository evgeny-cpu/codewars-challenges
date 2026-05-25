//Правила игры «Камень, ножницы, бумага» следующие:
//Рок побеждает ножницы.
//Ножницы побеждают бумагу.
//Бумага побеждает камень.
//Два одинаковых хода приведут к ничьей.
//Давайте играть! Вам будут даны допустимые ходы двух игроков в «Камень, ножницы, бумага», и вы должны будете указать,
// кто победил: "Player 1 won!"игроку 1 и "Player 2 won!"игроку 2. В случае ничьей укажите свой ход Draw!.
//https://www.codewars.com/kata/5672a98bdbdd995fad00000f/train/java

public class Main {
    public static void main(String[] args) {

        System.out.println(rps("rock", "scissors"));
    }

    public static String rps(String p1, String p2) {
        if (p1.equals(p2)) return "Draw!";
        if (p1.equals("paper") && p2.equals("rock")) return "Player 1 won!";
        if (p1.equals("paper") && p2.equals("scissors")) return "Player 2 won!";
        if (p1.equals("rock") && p2.equals("scissors")) return "Player 1 won!";
        if (p1.equals("rock") && p2.equals("paper")) return "Player 2 won!";
        if (p1.equals("scissors") && p2.equals("paper")) return "Player 1 won!";
        if (p1.equals("scissors") && p2.equals("rock")) return "Player 2 won!";
        return "";
    }
}