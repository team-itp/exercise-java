import java.util.HashSet;

/**
 * i を 1 ～ 20 まで回して、セット ( ```HashSet<String>``` ) に i を 5 
 * で割った余りを追加して、その内容を確認する
 */
public class Excercise5 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            set.add(Integer.toString(i % 5));
        }
        System.out.println("セットの内容を表示します。");
        int i = 0;
        for (String val : set) {
            System.out.println(i + "番目 : " + val);
            i++;
        }
    }
}