package ru.valiullin;

public class Person implements Comparable<Person> {

    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public int compareTo(Person p) {
        int compareResult = name.compareTo(p.getName());
        if(compareResult != 0) {
            return compareResult;
        } else {
            return age.compareTo(p.getAge());
        }
        //return name.compareTo(p.getName());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
