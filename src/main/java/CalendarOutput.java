public class CalendarOutput {

    public static void main (String[] args) {
        int daysInMonth = 31;
        String[] weekdayNames = new String[] {"Mo", "Di", "Mi", "Do", "Fr", "Sa", "So"};

//        System.out.println("Mo Di Mi Do Fr Sa So");
//        System.out.println(" 1  2  3  4  5  6  7");
//        System.out.println(" 8  9 10 11 12 13 14");
//        System.out.println("15 16 17 18 19 20 21");
//        System.out.println("22 23 24 25 26 27 28");
//        System.out.println("29 30 31");
        String month = "Januar";    // Wir wissen wie's geht, vertraut mir!
        printCalendarForMonth(month);
        printCalendarForMonth("Februar");
        daysInMonth = 28;
        printWeekdays(daysInMonth, weekdayNames);

        printCalendarForMonth("März");
        daysInMonth = 31;
        printWeekdays(daysInMonth,weekdayNames);

        printCalendarForMonth("April");
        printWeekdays(daysInMonth,weekdayNames);

        printCalendarForMonth("Mai");
        printWeekdays(daysInMonth,weekdayNames);

        printCalendarForMonth("Juni");
        printWeekdays(daysInMonth, weekdayNames);

        printCalendarForMonth("Juli");
        printWeekdays(daysInMonth, weekdayNames);

        printCalendarForMonth("August");
        daysInMonth = 30;
        printWeekdays(daysInMonth,weekdayNames);

        printCalendarForMonth("September");
        printWeekdays(daysInMonth,weekdayNames);

        printCalendarForMonth("Oktober");
        daysInMonth = 31;
        printWeekdays(daysInMonth,weekdayNames);

        printCalendarForMonth("November");
        printWeekdays(daysInMonth,weekdayNames);

        printCalendarForMonth("Dezember");
        printWeekdays(daysInMonth,weekdayNames);

    }

 public static void printCalendarForMonth(String monthName) {
     System.out.println("Kalender für " + monthName );
    }

    public static void printWeekdays(int daysInMonth, String[] weekdayNames) {
        //System.out.println("Mo Di Mi Do Fr Sa So");
        for (int x = 1; x <= daysInMonth; x++)
        {
            for (int y = 0; y < weekdayNames.length; y++)
            {
                System.out.printf("%2d ", x);
                System.out.println(weekdayNames[y]);
            }
            System.out.println();
        }
       // System.out.println(" 1  2  3  4  5  6  7");
    }
}

