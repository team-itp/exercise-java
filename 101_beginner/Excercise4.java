import java.util.Scanner;

/**
 * コンソールから文字列を読み取って、読み取った文字列を数字に変換し、その回数繰り返してコンソールに「Hello, World」を表示する
 */
public class Excercise4 {
    public static void main(String[] args) {
        try (Scanner reader = new Scanner(System.in)) {
            System.out.print("数値を入力してください: ");
            String input = reader.next();

            int repeatCount;
            try {
                repeatCount = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("エラー: 整数値のみ入力が可能です。");
                return;
            }

            if (repeatCount <= 0) {
                System.out.println("エラー: 1以上の数値を入力してください。");
                return;
            }

            for (int i = 0; i < repeatCount; i++) {
                System.out.println("Hello World!");
            }
        }
    }
}
