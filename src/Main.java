public class Main {
    public static void main(String[] args) {
        Person person = new Person("Азирет");
        person.getLeftPocket().add(new Money());
        person.getRightPocket().add(new HouseKeys());
        person.shakePockets();
    }
}
