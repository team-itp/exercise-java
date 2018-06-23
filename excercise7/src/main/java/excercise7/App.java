package excercise7;

/**
 * 1 から 100 までコンソールに表示する。ただし、3 の倍数は Fizz、
 * 5 の倍数は Buzz、3 と 5 の倍数は FizzBuzz を表示する
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
