package excercise9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * �R���\�[�����當�����ǂݎ���āA�ǂݎ����������𐔒l�ɕϊ����� (�������� Scanner#nextInt�AInteger#parseInt
 * �����g�p���Ȃ�����)
 *
 */
public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("���l����͂��Ă�������: ");
        String input = reader.readLine();

        int inputValue = 0;
        byte[] inputBytes = input.getBytes();
        for (int i = 0; i < input.length(); i++) {
            if (inputBytes[i] < 48 || inputBytes[i] > 57) {
                System.out.println("���͂��ꂽ���l�����̐����l�ł͂���܂���B");
                return;
            }
            inputValue = inputValue * 10 + (inputBytes[i] - 48);
        }

        System.out.println("���͂��ꂽ���l:" + inputValue);
    }
}
