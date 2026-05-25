//https://www.codewars.com/kata/5ab6538b379d20ad880000ab/train/java
public class Main {
    public static void main(String[] args) {


        System.out.println(areaOrPerimeter(4,4));
    }
    public static int areaOrPerimeter (int l, int w) {
        return l == w ? l * w : l * 2 + w * 2;
    }

}