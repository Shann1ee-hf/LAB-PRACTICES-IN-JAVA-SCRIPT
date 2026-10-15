package LAB_3;

import java.util.List;

public final class ImmutablePerson {
    private final String name;
    private final int age;
    private final List<String> hobbies;

    ImmutablePerson(String name, int age, List<String> hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = List.copyOf(hobbies);    // private copy of the list
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    List<String> getHobbies() {
        return hobbies;     // safe, because this list is already read-only
    }

    // instead of a setter, return a NEW object with the change
    ImmutablePerson withAge(int newAge) {
        return new ImmutablePerson(name, newAge, hobbies);
    }

    @Override
    public String toString() {
        return name + ", " + age + ", " + hobbies;
    }
}