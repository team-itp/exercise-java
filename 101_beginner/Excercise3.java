import java.util.Scanner;

/**
 * コンソールから文字列を読み取ってそれを表示する
 */
public class Excercise3 {
    public static void main(String[] args) {
        try (Scanner reader = new Scanner(System.in)) {
            System.out.print("文字列を入力してください: ");
            String input = reader.next();
            System.out.println("入力された文字列: " + input);
        }
    }
}
