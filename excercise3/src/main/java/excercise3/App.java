package excercise3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * �R���\�[�����當�����ǂݎ���Ă����\������
 */
public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("���������͂��Ă�������: ");
        String input = reader.readLine();
        System.out.println("���͂��ꂽ������: " + input);
    }
}
