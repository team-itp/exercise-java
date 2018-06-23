package excercie6;

/**
 * 1 から 100 までコンソールに表示する。ただし、5 の倍数は Buzz を表示する
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
