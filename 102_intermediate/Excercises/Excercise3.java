/**
 * Double の配列 [1.1, 2.2, 3.3, 5.5, 7.7, 11.11, 13.13, null, 19.19] の中から任意の数字を探す
 */
public class Excercise3 {
    public static void main(String[] args) {
        System.out.println("配列 [1.1, 2.2, 3.3, 5.5, 7.7, 11.11, 13.13, null, 19.19] の中から数字を探す");
        Double[] DoubleValues = new Double[] { 1.1, 2.2, 3.3, 5.5, 7.7, 11.11, 13.13, null, 19.19 };
        int indexOfOnePointOne = find(DoubleValues, 2.2);
        System.out.println("2.2   のインデックス: " + indexOfOnePointOne);
        int indexOfNineteenPointOneNine = find(DoubleValues, 19.19);
        System.out.println("19.19 のインデックス: " + indexOfNineteenPointOneNine);
    }

    public static int find(Double[] values, Double valueToFind) {
        for (int i = 0; i < values.length; i++) {
            if (values[i] == valueToFind) {
                return i;
            }
        }
        return -1;
    }
}