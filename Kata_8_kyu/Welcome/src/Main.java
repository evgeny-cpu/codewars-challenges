//https://www.codewars.com/kata/577ff15ad648a14b780000e7/train/java
public class Main {
    public static void main(String[] args) {

        System.out.println("english");


    }

    public static String greet(String language) {
        return switch (language) {
            case "english" -> "Welcome";
            case "czech" -> "Vitejte";
            case "danish" -> "Velkomst";
            case "dutch" -> "Welkom";
            case "estonian" -> "Tere tulemast";
            case "finnish" -> "Tervetuloa";
            case "flemish" -> "Welgekomen";
            case "french" -> "Bienvenue";
            case "german" -> "Willkommen";
            case "irish" -> "Failte";
            case "italian" -> "Benvenuto";
            case "latvian" -> "Gaidits";
            case "lithuanian" -> "Laukiamas";
            case "polish" -> "Witamy";
            case "spanish" -> "Bienvenido";
            case "swedish" -> "Valkommen";
            case "welsh" -> "Croeso";
            default -> "Welcome";
        };
    }
}