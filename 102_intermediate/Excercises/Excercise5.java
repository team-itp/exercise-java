import java.util.HashSet;
import java.util.Set;

/**
 * 10,000,000件の文字列のセット ( ```HashSet<String>``` ) を作成して ArrayList の場合と同様に文字列を検索しその時間を計測する
 */
public class Excercise5 {
    public static void main(String[] args) {
        long start = System.nanoTime();
        Set<String> strings = new HashSet<String>();
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

    private static void find(Set<String> strings, String valueToFind) {
        System.out.println("文字列「" + valueToFind + "」を検索します");
        long start = System.nanoTime();
        if (strings.contains(valueToFind)) {
            System.out.println("存在します。");
        } else {
            System.out.println("存在しません。");
        }
        long end = System.nanoTime();
        System.out.println(String.format("%f秒かかりました。", ((double) end - (double) start) / 1000d / 1000d / 1000d));
    }
}