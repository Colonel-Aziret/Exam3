import java.util.HashSet;
import java.util.Set;

public class Person extends AbstractPerson {
    private String name;
    private final Set<AbstractItem> leftPocket = new HashSet<>();
    private final Set<AbstractItem> rightPocket = new HashSet<>();

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<AbstractItem> getLeftPocket() {
        return leftPocket;
    }

    public Set<AbstractItem> getRightPocket() {
        return rightPocket;
    }

    public void shakePockets() { // Встряхнуть карманы
        for (AbstractItem abstractItem : leftPocket) {
            if(abstractItem instanceof Paperable) {
                ((Paperable) abstractItem).bend();
            }
            if(abstractItem instanceof Soundable) {
                ((Soundable) abstractItem).sound();
            }
        }
        for (AbstractItem abstractThing : rightPocket) {
            if(abstractThing instanceof Paperable) {
                ((Paperable) abstractThing).bend();
            }
            if(abstractThing instanceof Soundable) {
                ((Soundable) abstractThing).sound();
            }
        }
    }

    @Override
    public String toString() {
        return "Person: " + name;
    }
}
