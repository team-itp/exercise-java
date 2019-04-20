import java.util.ArrayList;
import java.util.List;

/**
 * 10,000,000件の文字列のリスト ( ```ArrayList<String>``` ) を作成して先頭・真ん中・最後尾の文字列を検索しその時間を計測する
 */
public class Excercise4 {
    public static void main(String[] args) {
        long start = System.nanoTime();
        List<String> strings = new ArrayList<String>();
        for (int i = 0; i < 10000000; i++) {
            String newString = String.format("string-%07d", i);
            strings.add(newString);
            System.out.println(newString);
        }
        long end = System.nanoTime();
        System.out.println(String.format("%f秒かかりました。", ((double) end - (double) start) / 1000d / 1000d / 1000d));
        find(strings, "string-0000000");
        find(strings, "string-5000000‬");
        find(strings, "string-9999999");
    }

    private static void find(List<String> strings, String valueToFind) {
        System.out.println("文字列「" + valueToFind + "」を検索します");
        long start = System.nanoTime();
        System.out.println(strings.indexOf(valueToFind) + "番目");
        long end = System.nanoTime();
        System.out.println(String.format("%f秒かかりました。", ((double) end - (double) start) / 1000d / 1000d / 1000d));
    }
}