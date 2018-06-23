package excercise8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * �R���\�[�����琔�l��ǂݎ���āA���̐��l���f�����ǂ������肷��
 */
public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("���l����͂��Ă�������: ");
        String input = reader.readLine();

        int number;
        try {
            number = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("�G���[: �����ɕϊ��ł��܂���B");
            return;
        }

        if (number <= 0) {
            System.out.println("�G���[: 1�ȏ�̐��l����͂��Ă��������B");
            return;
        }

        boolean isPrime = true;
        for (int i = 2; i < number - 1; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }

        if (isPrime) {
            System.out.println("���͂��ꂽ���l�͑f���ł��B" );
        } else {
            System.out.println("���͂��ꂽ���l�͑f���ł͂���܂���B" );
        }
    }
}
