package excercise5;

/**
 * 1 から 100 までコンソールに表示する。ただし、3 の倍数は Fizz を表示する
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
