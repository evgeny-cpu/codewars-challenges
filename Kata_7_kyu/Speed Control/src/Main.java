//В машине Джона GPS-навигатор каждую sсекунду записывает пройденное расстояние от
// начальной точки (расстояния измеряются в произвольной, но постоянной единице измерения). Например, ниже приведена часть записи, содержащая s = 15:
//https://www.codewars.com/kata/56484848ba95170a8000004d/train/java
public class Main {
    public static void main(String[] args) {


        System.out.println(gps(5,new double[]{0.0, 0.19, 0.5, 0.75, 1.0, 1.25, 1.5, 1.75, 2.0, 2.25}));
    }
    public static int gps(int s, double[] x) {
        if (x.length <= 1){
            return 0;
        }
        double maxSpeed = 0.0;
        for (int i =0; i < x.length - 1 ; i++){
            double deltaDistance = x[i+1] - x[i];
            double speed = (3600 * deltaDistance) / s;
            if (speed > maxSpeed){
                maxSpeed = speed;
            }
        }
        return (int) Math.floor(maxSpeed);
    }
}