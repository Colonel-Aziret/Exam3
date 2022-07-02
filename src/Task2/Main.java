package Task2;

import java.util.LinkedList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws Exception {

        // Task 2

        LinkedList<Person> people = new LinkedList<>();
        Person person1 = new Person("Раманкулов", "Азирет", "Нурбекович");
        Person person2 = new Person("Путин", "Владимир", "Владимирович");
        Person person3 = new Person("Лукашенко", "Александр", "Григорьевич");
        Person person4 = new Person("Лукашенко", "Александр", "Григорьевич");
        System.out.println(add(person1,people));
        System.out.println(add(person2,people));
        System.out.println(add(person3,people));
        System.out.println(add(person4,people));
    }

    public static List<Person> add(Person person,LinkedList<Person> list) throws Exception { // Метод добавления
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals(person)){
                throw new Exception("Person is already exist");
            }
        }
        list.add(person);
        return list;
    }
}