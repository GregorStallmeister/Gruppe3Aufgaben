public class CalendarOutput {

    public static void main (String[] args) {
        int daysInMonth = 31;
        String[] weekdayNames = new String[] {"Mo", "Di", "Mi", "Do", "Fr", "Sa", "So"};
        String[] months = new String[] {"Januar", "Februar", "März", "April", "Mai", "Juni", "Juli", "August", "September", "Oktober", "November", "Dezember"};

        for (String month : months) {
            printCalendarForMonth(month);
            printWeekdays(daysInMonth, weekdayNames);
        }
    }

 public static void printCalendarForMonth(String monthName) {
     System.out.println("Kalender für " + monthName );
    }

    public static void printWeekdays(int daysInMonth, String[] weekdayNames) {
        //System.out.println("Mo Di Mi Do Fr Sa So");
        for (int x = 1; x <= daysInMonth; x++)
        {
            for (String weekdayName : weekdayNames) {
                System.out.printf("%2d ", x);
                System.out.println(weekdayName);
            }
            System.out.println();
        }
       // System.out.println(" 1  2  3  4  5  6  7");
    }
}

