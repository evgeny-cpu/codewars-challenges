public class Main {
    public static void main(String[] args) {

        System.out.println(mouthSize("ALLIGATOR"));
    }
    public static String mouthSize(String animal){
        return animal.equalsIgnoreCase("alligator") ? "small" : "wide";
    }
}