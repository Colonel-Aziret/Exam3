public class Money extends AbstractItem implements Paperable{
    @Override
    public void bend() {
        System.out.println(this + "*МНЕТСЯ*МНЕТСЯ*МНЕТСЯ");
    }
    @Override
    public String toString() {
        return "Деньги";
    }
}

