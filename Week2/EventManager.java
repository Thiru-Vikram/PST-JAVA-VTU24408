package Week2;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

class Event {
    String name;
    LocalDate date;

    Event(String name, String dateStr) {
        this.name = name;
        this.date = LocalDate.parse(dateStr);
    }
}

public class EventManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<Event> events = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] parts = sc.nextLine().split(" ");
            events.add(new Event(parts[0], parts[1]));
        }

        int monthFilter = sc.nextInt();

        events.sort(Comparator.comparing(e -> e.date));
        for (Event e : events)
            System.out.print(e.name + " ");
        System.out.println();

        System.out.println(events.get(0).name);
        System.out.println(events.get(events.size() - 1).name);

        List<String> monthEvents = events.stream()
                .filter(e -> e.date.getMonthValue() == monthFilter)
                .map(e -> e.name)
                .collect(Collectors.toList());
        monthEvents.forEach(e -> System.out.print(e + " "));
        System.out.println();

        sc.close();
    }
}