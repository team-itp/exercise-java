import java.util.Scanner;

/**
 * コンソールから文字列を読み取って、読み取った文字列を数値に変換する
 * (※ただし Scanner#nextInt、Integer#parseInt 等を使用しないこと)
 */
public class Excercise9 {
    public static void main(String[] args) {
        try (Scanner reader = new Scanner(System.in)) {
            System.out.print("数値を入力してください: ");
            String input = reader.next();

            int inputValue = 0;
            byte[] inputBytes = input.getBytes();
            for (int i = 0; i < input.length(); i++) {
                if (inputBytes[i] < 48 || inputBytes[i] > 57) {
                    System.out.println("入力された数値が正の整数値ではありません。");
                    return;
                }
                inputValue = inputValue * 10 + (inputBytes[i] - 48);
            }

            System.out.println("入力された数値:" + inputValue);
        }
    }
}
