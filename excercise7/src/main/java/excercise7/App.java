package excercise7;

/**
 * 1 ���� 100 �܂ŃR���\�[���ɕ\������B�������A3 �̔{���� Fizz�A
 * 5 �̔{���� Buzz�A3 �� 5 �̔{���� FizzBuzz ��\������
 */
public class App {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
