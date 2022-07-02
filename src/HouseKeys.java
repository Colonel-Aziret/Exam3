public class HouseKeys extends AbstractItem implements Soundable{
    @Override
    public void sound() {
        System.out.println(this + "*ЗВУК*ЗВУК*ЗВУК*");
    }

    @Override
    public String toString() {
        return "Keys";
    }
}
