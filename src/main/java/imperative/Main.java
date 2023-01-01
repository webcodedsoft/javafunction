package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static imperative.Main.Person.Gender.*;

public class Main {
    public static void main(String [] args) {

        List<Person> peoples = List.of(
                new Person("Adesola", Male),
                new Person("Ganiyat", Female),
                new Person("Kareem", Male)
        );

        //Imperative
        List<Person> males = new ArrayList<>();

        for (Person people: peoples) {
            if(people.gender == Male) {
                males.add(people);
            }
        }

        for (Person male: males) {
            System.out.println(male);
        }

        //Declarative
        List<Person> malesPeople = peoples.stream()
                .filter(people -> Male.equals(people.gender))
                .collect(Collectors.toList());
        malesPeople.forEach(System.out::println);
    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }

        enum Gender { Female, Male }

    }
}
