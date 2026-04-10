import java.util.Arrays;

//Входные данные: массив целых чисел.
//Результат: этот массив, но отсортированный таким образом, что в нем два крыла:
//Левое крыло с уменьшающейся численностью,
//Правое крыло, численность которого увеличивается.
//Длина обоих крыльев одинакова. Если длина массива нечетная, крылья расположены у основания, если длина четная, основание считается частью правого крыла.
//Каждое целое число lв левом крыле должно быть больше или равно соответствующему числу rв правом крыле, причем разница l - rдолжна быть как можно меньше. Другими словами, правое крыло должно быть почти таким же крутым, как левое.
//Функция такова: make_valley or makeValley or make-valley.
//https://www.codewars.com/kata/56e3cd1d93c3d940e50006a4/train/java
public class Main {
    public static void main(String[] args) {

        int[] number = new int[]{79, 35, 54, 19, 35, 25};

        int [] result = makeValley(number);

        for (int i : result){
            System.out.println(i);
        }
    }

    public static int[] makeValley(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int[] result = new int[n];

        int left = 0;
        int right = n - 1;
        for (int i = n - 1; i >= 0; i--) {
            if ((n - 1 - i) %2 ==0) {
                result[left++] = arr[i];
            }else{
                result[right--] = arr[i];
            }
        }
        return result;
    }

}