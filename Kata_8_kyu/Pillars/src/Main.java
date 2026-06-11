//https://www.codewars.com/kata/5bb0c58f484fcd170700063d/train/java
public class Main {
    public static void main(String[] args) {

        System.out.println(pillars(11,15,30));
    }

    public static int pillars(int numPill, int dist, int width) {
        if(numPill < 2){
            return 0;
        }
        return (numPill -1 ) * (dist * 100) + (numPill - 2) * width;
    }
}