/**
 * int の配列 [1, 2, 3, 5, 7, 11, 13, 17, 19] の中から任意の数字を探す
 */
public class Excercise1 {
    public static void main(String[] args) {
        System.out.println("配列 [1, 2, 3, 5, 7, 11, 13, 17, 19] の中から数字を探す");
        int[] intValues = new int[] { 1, 2, 3, 5, 7, 11, 13, 17, 19 };
        int indexOfThree = find(intValues, 3);
        System.out.println("3 のインデックス:  " + indexOfThree);
        int indexOfFour = find(intValues, 4);
        System.out.println("4 のインデックス: " + indexOfFour + " (-1 は存在しないの意味)");
    }

    public static int find(int[] values, int valueToFind) {
        for (int i = 0; i < values.length; i++) {
            if (values[i] == valueToFind) {
                return i;
            }
        }
        return -1;
    }
}