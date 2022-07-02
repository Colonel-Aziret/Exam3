package Task2;

import java.util.Objects;

public class Person {
    String surName;
    String firstName;
    String patronymic;

    public Person(String surName, String firstName, String patronymic) {
        this.surName = surName;
        this.firstName = firstName;
        this.patronymic = patronymic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(surName, person.surName) && Objects.equals(firstName, person.firstName) && Objects.equals(patronymic, person.patronymic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surName, firstName, patronymic);
    }

    @Override
    public String toString() {
        return "Task2.Person{" +
                "surName='" + surName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                '}';
    }
}
