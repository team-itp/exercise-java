package excercise9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * コンソールから文字列を読み取って、読み取った文字列を数値に変換する (※ただし Scanner#nextInt、Integer#parseInt
 * 等を使用しないこと)
 *
 */
public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("数値を入力してください: ");
        String input = reader.readLine();

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
