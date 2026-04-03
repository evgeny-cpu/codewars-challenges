//Вы владеете компанией по производству коробок, которая может изготавливать коробки в форме любого правильного многоугольника.
//Многие клиенты используют эти коробки для транспортировки круглых предметов, таких как жестяные банки, стаканы, шины или компакт-диски.
//Чтобы им помочь, вы решили напечатать на каждой коробке диаметр наибольшего круга, который может поместиться внутри коробки.
//Вход
//Число равных сторон правильного многоугольника (количество сторон ≥ 3),
//Длина каждой стороны многоугольника.
//Выход
//Возвращает диаметр наибольшего круглого объекта, который может поместиться внутри многоугольника, с точностью до 0,001.
//https://www.codewars.com/kata/5a026a9cffe75fbace00007f/train/java
public class Polygon {
    int sides;
    int sideLength;

    public static void main(String[] args) {
        Polygon polygon = new Polygon(4,5);
        System.out.println(polygon.circleDiameter());

    }

    public Polygon(int sides, int sideLength) {
        this.sides = sides;
        this.sideLength = sideLength;
    }

    public double circleDiameter() {
        if (sides < 3 || sideLength <= 0 ){
            return 0.0;
        }
        double diameter = sideLength / Math.tan(Math.PI / sides);
        return Math.round(diameter * 1000.0) / 1000.0;
    }
}