import java.time.LocalDate;

public class COLLEDGE_LocalDateExample {
    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Calculate yesterday's date
        LocalDate yesterdayDate = currentDate.minusDays(1);

        // Calculate tomorrow's date
        LocalDate tomorrowDate = yesterdayDate.plusDays(2);

        // Print dates
        System.out.println("Today's date: " + currentDate);
        System.out.println("Yesterday's date: " + yesterdayDate);
        System.out.println("Tomorrow's date: " + tomorrowDate);
    }
}

