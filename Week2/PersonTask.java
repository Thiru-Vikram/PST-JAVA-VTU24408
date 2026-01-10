package Week2;

import java.util.*;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String getName() {
        return name;
    }

    String toUpperCaseName() {
        return name.toUpperCase();
    }

    static boolean isOlderThan(Person p, int limit) {
        return p.age > limit;
    }
}

public class PersonTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Person> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int age = sc.nextInt();
            list.add(new Person(name, age));
        }

        int ageLimit = sc.nextInt();

        list.stream()
                .sorted(Comparator.comparing(Person::getName))
                .map(Person::getName)
                .forEach(name -> System.out.print(name + " "));
        System.out.println();

        list.stream()
                .filter(p -> Person.isOlderThan(p, ageLimit))
                .map(Person::getName)
                .forEach(name -> System.out.print(name + " "));
        System.out.println();

        list.stream()
                .map(Person::toUpperCaseName)
                .forEach(name -> System.out.print(name + " "));
        System.out.println();

        sc.close();
    }
}