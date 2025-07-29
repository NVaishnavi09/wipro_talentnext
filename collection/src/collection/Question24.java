package collection;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Question24{
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        LocalTime timeAfter25 = currentTime.plusMinutes(25);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        System.out.println("Current Time      : " + currentTime.format(formatter));
        System.out.println("Time after 25 min : " + timeAfter25.format(formatter));
    }
}
