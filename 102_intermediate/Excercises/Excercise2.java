/**
 * String の配列 ["Tokyo", "Nagoya", "Osaka", "Kyoto"] の中から任意の文字列を探す
 */
public class Excercise2 {
    public static void main(String[] args) {
        System.out.println("配列 [\"Tokyo\", \"Nagoya\", \"Osaka\", \"Kyoto\"] の中から文字列を探す");
        String[] stringValues = new String[] { "Tokyo", "Nagoya", "Osaka", "Kyoto" };
        int indexOfOsaka = find(stringValues, "Osaka");
        System.out.println("\"Osaka\"  のインデックス:  " + indexOfOsaka);
        int indexOfSendai = find(stringValues, "Sendai");
        System.out.println("\"Sendai\" のインデックス: " + indexOfSendai);
        int indexOfOsaka2 = find(stringValues, new StringBuilder("Osaka").toString());
        System.out.println("\"Osaka\"  のインデックス: " + indexOfOsaka2 + " (StringBuilderで\"Osaka\"を作った場合)");
    }

    public static int find(String[] values, String valueToFind) {
        for (int i = 0; i < values.length; i++) {
            if (values[i] == valueToFind) {
                return i;
            }
        }
        return -1;
    }
}