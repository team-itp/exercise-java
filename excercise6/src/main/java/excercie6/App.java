package excercie6;

/**
 * 1 ���� 100 �܂ŃR���\�[���ɕ\������B�������A5 �̔{���� Buzz ��\������
 */
public class App {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
