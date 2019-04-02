public class Calendar {
    public static void main(String[] args) {
        // システム日付のカレンダーオブジェクトを取得する
        java.util.Calendar cal = java.util.Calendar.getInstance();
        // java.util.Calendar オブジェクトの日付をシステム日付の 1 日にセットする
        cal.set(java.util.Calendar.DAY_OF_MONTH, 1);
        // 曜日を取得する (0が日曜日)
        int firstDayOfWeek = cal.get(java.util.Calendar.DAY_OF_WEEK);
        // 当月の最終日を取得する
        int numberOfDaysInMonth = cal.getActualMaximum(java.util.Calendar.DAY_OF_MONTH);
        // カレンダーを表示する
        printCalendar(firstDayOfWeek, numberOfDaysInMonth);
    }

    private static void printCalendar(int firstDayOfWeek, int numberOfDaysInMonth) {
        // カレンダーの出力処理
        System.out.println("日 月 火 水 木 金 土");
        for (int i = 0; i < firstDayOfWeek; i++) {
            System.out.print("   ");
        }

        for (int i = 1; i <= numberOfDaysInMonth; i++) {
            System.out.print(String.format("%2d", i));
            if ((i + firstDayOfWeek) % 7 == 0) {
                System.out.println();
            } else {
                System.out.print(" ");
            }
        }
    }
}