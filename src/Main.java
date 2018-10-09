import ru.valiullin.Person;
import ru.valiullin.PersonSimple;
import ru.valiullin.PersonSuperComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //TODO Написать класс PersonSuperComparator, который имплементит Comparator, но умеет сравнивать по двум параметрам,
        // возраст и имя. Класс Person теперь содержит два поля int age и String name

        List<PersonSimple> peopleSimple = new ArrayList<>();
        peopleSimple.add(new PersonSimple("Tom",45));
        peopleSimple.add(new PersonSimple("Tom",10));
        peopleSimple.add(new PersonSimple("Nick",50));
        peopleSimple.add(new PersonSimple("Nick",40));
        peopleSimple.add(new PersonSimple("Alice",20));
        peopleSimple.add(new PersonSimple("Alice",15));
        peopleSimple.add(new PersonSimple("Bill",40));
        peopleSimple.add(new PersonSimple("Bill",20));
        peopleSimple.add(new PersonSimple("Iskander",25));

        List<Person> people = new ArrayList<>();
        people.add(new Person("Tom", 40));
        people.add(new Person("Tom", 20));
        people.add(new Person("Nick",45));
        people.add(new Person("Nick",40));
        people.add(new Person("Alice",20));
        people.add(new Person("Alice",10));
        people.add(new Person("Bill",35));
        people.add(new Person("Bill",30));
        people.add(new Person("Iskander",25));

        iterate(people);

        System.out.println();
        System.out.println("peopleSimple list");
        System.out.println();

        for (PersonSimple personSimple : peopleSimple) {
            System.out.println(personSimple.getName() + " " + personSimple.getAge());
        }

        System.out.println();
        System.out.println("People list");
        System.out.println();

        for (Person person : people) {
            System.out.println(person.getName() + " " + person.getAge());
        }

        Collections.sort(people); //отсортировал в прямом порядке
        Collections.sort(peopleSimple, new PersonSuperComparator()); // почему то отсортировал в обратном порядке?
        //Нашел, в классе супер компоратора нужно менять переменные a и b местами

        System.out.println();
        System.out.println("Sorted people list");
        System.out.println();

        for (Person person : people) {
            System.out.println(person.getName() + " " + person.getAge());
        }

        System.out.println();
        System.out.println("Sorted peopleSimple list");
        System.out.println();

        for (PersonSimple person : peopleSimple) {
            System.out.println(person.getName() + " " + person.getAge());
        }

    }

    private static void iterate(List<Person> people) {
        Iterator i = people.iterator();
        while (i.hasNext()) {
            System.out.print(i.next());
            System.out.print(" : ");
        }
        System.out.println();
    }
}
