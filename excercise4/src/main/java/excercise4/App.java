package excercise4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * �R���\�[�����當�����ǂݎ���āA�ǂݎ����������𐔎��ɕϊ����A
 * ���̉񐔌J��Ԃ��ăR���\�[���ɁuHello, World�v��\������
 */
public class App 
{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("���l����͂��Ă�������: ");
        String input = reader.readLine();

        int repeatCount;
        try {
            repeatCount = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("�G���[: �����l�̂ݓ��͂��\�ł��B");
            return;
        }

        if (repeatCount <= 0) {
            System.out.println("�G���[: 1�ȏ�̐��l����͂��Ă��������B");
            return;
        }

        for (int i = 0; i < repeatCount; i++) {
            System.out.println( "Hello World!" );
        }
    }
}
