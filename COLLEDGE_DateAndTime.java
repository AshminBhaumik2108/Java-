import java.time.*;
import java.time.format.DateTimeFormatter;

public class COLLEDGE_DateAndTime {
// declaring a user defined function........
    public static void LocalDateTimeApi() {

        // Get the current date
        LocalDate currentDate = LocalDate.now();
        System.out.println("The current date is " + currentDate);

        // Get the current time
        LocalTime currentTime = LocalTime.now();
        System.out.println("The current time is " + currentTime);

        // Get the current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current date and time: " + currentDateTime);

        // Format the current date and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("In formatted manner: " + formattedDateTime);

        // Print month, day, and seconds separately
        Month month = currentDateTime.getMonth();
        int dayOfMonth = currentDateTime.getDayOfMonth();
        int seconds = currentDateTime.getSecond();
        System.out.println("Month: " + month + " Day: " + dayOfMonth + " Seconds: " + seconds);

        // Print a specified date
        LocalDate republicDay = LocalDate.of(1950, 1, 26);
        System.out.println("The Republic Day: " + republicDay);

        // Print a specific date with the current time
        LocalDateTime specificDateTime = currentDateTime.withDayOfMonth(24).withYear(2016);
        System.out.println("Specific date with current time: " + specificDateTime);
    }

    // Main method
    public static void main(String[] args) {
        // Calling the user defined function........................
        LocalDateTimeApi();
    }
}

