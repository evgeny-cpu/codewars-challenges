//Натан обожает кататься на велосипеде.
//Поскольку Натан знает, как важно поддерживать водный баланс, он выпивает 0,5 литра воды за каждый час езды на велосипеде.
//Вам дается время в часах, и вы должны вернуть количество литров, которое Натан выпьет, округленное в меньшую сторону .
//https://www.codewars.com/kata/582cb0224e56e068d800003c/train/java

public class Main {
    public static void main(String[] args) {

        System.out.println(liters(3));

    }

    public static int liters(double time) {
        return (int) Math.floor(time * 0.5);
    }
}