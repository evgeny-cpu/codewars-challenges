//My friend John likes to go to the cinema. He can choose between system A and system B.
//If John goes to the cinema 3 times:
//https://www.codewars.com/kata/562f91ff6a8b77dfe900006e/train/java
public class Main {
    public static void main(String[] args) {

        System.out.println(movie(500, 15, 0.9));
    }

    public static int movie(int card, int ticket, double perc) {
        double a = 0;
        double b = card;
        double ticketPrice = ticket;
        int count = 0;


        while (Math.ceil(b) >= a) {
            count++;
            a += ticket;
            ticketPrice *= perc;
            b += ticketPrice;
        }

        return count;
    }
}