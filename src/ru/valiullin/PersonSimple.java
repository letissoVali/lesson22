package ru.valiullin;

public class PersonSimple {
    private String name;
    private Integer age;

    public PersonSimple(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "PersonSimple{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

