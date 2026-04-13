//Вход:
//строкаstrng
//массив строкarr
//Результат работы функции contain_all_rots(strng, arr) (or containAllRots or contain-all-rots):
//логическое значение, trueесли все повороты strngвключены вarr
//falseв противном случае
//https://www.codewars.com/kata/5700c9acc1555755be00027e/train/java
import java.util.List;
public class Main {
    public static void main(String[] args) {

        String[]words = new String[]{"bsjq", "qbsj", "sjqb", "twZNsslC", "jqbs"};
        System.out.println(containAllRots("bsjq", List.of(words)));

    }

    public static boolean containAllRots(String strng, List<String> arr) {
        if (strng.isEmpty()) {
            return true;
        }
        for(int i =0 ; i < strng.length(); i ++){
            String s = strng.substring(i) + strng.substring(0,i);
            if (!arr.contains(s)){
                return false;
            }
        }
        return true;
    }
}