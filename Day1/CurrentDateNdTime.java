package Day1;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateNdTime {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter time = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm a");

        System.out.println("The date and time is: " + time.format(now));
    }
}
