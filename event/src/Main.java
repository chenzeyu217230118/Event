import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Scanner;

public class Main {
public static void main(String[] args) throws Exception {
 try (Scanner scanner = new Scanner(System.in)) {
 System.out.println("Enter the eventID:");
 String eventID = scanner.nextLine();

 System.out.println("Enter the event name:");
String eventName = scanner.nextLine();
 System.out.println("Enter the event venue:");
 String eventVenue = scanner.nextLine();

 System.out.println("Enter the event date(YYYY-MM-DD):");
 String eventDateStr = scanner.nextLine();
            SimpleDateFormat formatter = new SimpleDateFormat("YYYY-MM-DD");
            Date eventDate = formatter.parse(eventDateStr);

            Event event = new Event(eventID, eventName, eventVenue, eventDate);

while (true) {
System.out.println("Enter the name of the attendee(Enter 'exit' to end the process)");
 String attendee = scanner.nextLine();
if ("exit".equals(attendee)) {
 break;
 }
 event.getEventAttendees().add(attendee);
 }


 System.out.println(event.toString());
}
 }
}

