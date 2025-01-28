public class CalendarOutput {

    public static void main (String[] args) {

//        System.out.println("Mo Di Mi Do Fr Sa So");
//        System.out.println(" 1  2  3  4  5  6  7");
//        System.out.println(" 8  9 10 11 12 13 14");
//        System.out.println("15 16 17 18 19 20 21");
//        System.out.println("22 23 24 25 26 27 28");
//        System.out.println("29 30 31");
        String month = "Januar";    // Wir wissen wie's geht, vertraut mir!
        printCalendarForMonth(month);
        printCalendarForMonth("Februar");
        printWeekdays();

        printCalendarForMonth("März");
        printWeekdays();

        printCalendarForMonth("April");
        printWeekdays();

        printCalendarForMonth("Mai");
        printWeekdays();

        printCalendarForMonth("Juni");
        printWeekdays();

        printCalendarForMonth("Juli");
        printWeekdays();

        printCalendarForMonth("August");
        printWeekdays();

        printCalendarForMonth("September");
        printWeekdays();

        printCalendarForMonth("Oktober");
        printWeekdays();

        printCalendarForMonth("November");
        printWeekdays();

        printCalendarForMonth("Dezember");
        printWeekdays();

    }

 public static void printCalendarForMonth(String monthName) {
     System.out.println("Kalender für " + monthName );

    }

    public static void printWeekdays() {
        System.out.println("Mo Di Mi Do Fr Sa So");
        System.out.println(" 1  2  3  4  5  6  7");
    }
}

