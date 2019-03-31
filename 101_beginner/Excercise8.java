import java.util.Scanner;

/**
 * コンソールから数値を読み取って、その数値が素数かどうか判定する
 */
public class Excercise8 {
    public static void main(String[] args) {
        try (Scanner reader = new Scanner(System.in)) {
            System.out.print("数値を入力してください: ");
            String input = reader.next();

            int number;
            try {
                number = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("エラー: 整数に変換できません。");
                return;
            }

            if (number <= 0) {
                System.out.println("エラー: 1以上の数値を入力してください。");
                return;
            }

            boolean isPrime = true;
            for (int i = 2; i < number - 1; i++) {
                if (number % i == 0) {
                    isPrime = false;
                }
            }

            if (isPrime) {
                System.out.println("入力された数値は素数です。");
            } else {
                System.out.println("入力された数値は素数ではありません。");
            }
        }
    }
}
