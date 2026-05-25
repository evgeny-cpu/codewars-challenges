public class Main {
    public static void main(String[] args) {

        int[] number = digitize(35231 );
        for (int i : number){
            System.out.println(i);
        }
    }
    public static int[] digitize(long n) {
        return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
    }
}