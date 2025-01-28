public class CalendarOutput {

    public static void main(String[] args) {
        String[] weekdayNames = {"Mo", "Di", "Mi", "Do", "Fr", "Sa", "So"};
        String[] months =
        {
                "Januar", "Februar", "März", "April", "Mai", "Juni",
                "Juli", "August", "September", "Oktober", "November", "Dezember"
        };
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // no leap year.

        int startingWeekday = 0; // 0 = Monday, 1 = Tuesday, ..., 6 = Sunday

        for (int i = 0; i < months.length; i++)
        {
            printCalendarForMonth(months[i], daysInMonth[i], weekdayNames, startingWeekday);
            System.out.println();

            // Update the starting weekday for the next month
            startingWeekday = (startingWeekday + daysInMonth[i]) % 7;
        }
    }

    public static void printCalendarForMonth(String monthName, int daysInMonth, String[] weekdayNames, int startingWeekday)
    {
        System.out.println(monthName);
        printWeekdayHeaders(weekdayNames);
        printDays(daysInMonth, startingWeekday);
    }

    public static void printWeekdayHeaders(String[] weekdayNames)
    {
        for (String day : weekdayNames) {
            System.out.printf("%3s", day); // Print weekday names (aligned).
        }
        System.out.println();
    }

    public static void printDays(int daysInMonth, int startingWeekday)
    {
        // Print leading spaces for the starting weekday:
        for (int i = 0; i < startingWeekday; i++) {
            System.out.print("   "); // Add spacing for days before the 1st.
        }

        // Print all days of the month:
        for (int day = 1; day <= daysInMonth; day++)
        {
            System.out.printf("%3d", day);

            // Break line after every Sunday (7th day of the week):
            if ((day + startingWeekday) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}

