//Вы в зоопарке... все сурикаты выглядят странно. Что-то пошло ужасно не так — кто-то поменял им местами головы и хвосты!
//
//Спасите животных, поменяв их местами. Вам будет предоставлен массив, содержащий три значения (хвост, тело, голова). Ваша задача — переставить элементы массива так, чтобы животные оказались в правильном положении (голова, тело, хвост).
//
//То же самое относится и ко всем остальным массивам/спискам, которые вы встретите в тестах: вам нужно будет менять позиции элементов, используя ту же самую логику.
//https://www.codewars.com/kata/56f699cd9400f5b7d8000b55/train/java
public class Main {
    public static void main(String[] args) {

        String[] message = new String[]{"tail", "body", "head"};

        String[] result = fixTheMeerkat(message);
        for (String s : result){
            System.out.println(s);
        }
    }

    public static String[] fixTheMeerkat(String[] arr) {
        String s = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = s;
        return arr;
    }
}
