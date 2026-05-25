//Алекс только что получил новый обруч, он в восторге, но расстроен, потому что его младший брат крутит его лучше.
//Напишите программу, в которой Алекс сможет ввести ( n) количество оборотов обруча, и программа вернет ему ободряющее сообщение:
//Если Алекс соберет 10 или более колец, верните строку "Great, now move on to tricks".
//Если он не получит 10 колец, верните веревку "Keep at it until you get it".
//https://www.codewars.com/kata/55cb632c1a5d7b3ad0000145/train/java
public class Main {
    public static void main(String[] args) {


        System.out.println(hoopCount(10));
    }

    public static String hoopCount(int n) {
        return n >= 10 ? "Great, now move on to tricks" : "Keep at it until you get it";
    }
}