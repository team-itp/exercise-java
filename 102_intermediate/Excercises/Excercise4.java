import java.util.ArrayList;

/**
 * i を 1 ～ 20 まで回して、リスト ( ```ArrayList<String>``` ) に i を 5
 * で割った余りを追加して、その内容を確認する
 */
public class Excercise4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(Integer.toString(i % 5));
        }
        System.out.println("リストの内容を表示します。");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + "番目 : " + list.get(i));
        }
    }
}