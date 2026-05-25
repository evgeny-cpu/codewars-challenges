//Даны две строки, состоящие из +и -. Верните новую строку, которая показывает, как эти две строки взаимодействуют следующим образом:
//Когда положительные величины взаимодействуют, они остаются положительными .
//Когда отрицательные числа взаимодействуют, они остаются отрицательными .
//Но когда отрицательные и положительные числа взаимодействуют, они становятся нейтральными и отображаются в виде числа 0.
//https://www.codewars.com/kata/65128732b5aff40032a3d8f0/train/java
public class Main {
    public static void main(String[] args) {

        System.out.println(neutralise("--+++-+-", "+++++---"));

    }

    public static String neutralise(String s1, String s2) {
        StringBuilder result = new StringBuilder();
        char [] value1 = s1.toCharArray();
        char [] value2 = s2.toCharArray();
        for (int i = 0; i < value1.length; i++){
            if (value1[i] == value2[i]){
                result.append(value1[i]);
            }else{
                result.append("0");
            }
        }
        return result.toString();
    }
}