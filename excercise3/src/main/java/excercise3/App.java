package excercise3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * コンソールから文字列を読み取ってそれを表示する
 */
public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("文字列を入力してください: ");
        String input = reader.readLine();
        System.out.println("入力された文字列: " + input);
    }
}
