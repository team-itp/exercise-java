package excercise5;

/**
 * 1 ���� 100 �܂ŃR���\�[���ɕ\������B�������A3 �̔{���� Fizz ��\������
 */
public class App {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }
}
