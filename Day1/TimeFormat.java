package Day1;

import java.time.LocalTime; // This holds the time
import java.time.format.DateTimeFormatter; // This is our "glasses"

public class TimeFormat {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();

        DateTimeFormatter time = DateTimeFormatter.ofPattern("hh:mm a");

        System.out.println("The time is: " + time.format(now));
    }
}