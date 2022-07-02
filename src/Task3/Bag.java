package Task3;

import Task3.BottleShape.BottleShape;
import Task3.Flat.Flat;
import Task3.Round.Apple;
import Task3.Round.Round;
import Task3.Round.TennisBalls;

public class Bag {
    private Round[] array;
    private Flat flat;
    private BottleShape bottleShape;
    private final int id;
    private static int count;

    public Bag(Round[] array, Flat flat, BottleShape bottleShape) {
        this.array = array;
        this.flat = flat;
        this.bottleShape = bottleShape;
        count++;
        this.id = count;
    }

    public Round[] getArray() {
        return array;
    }

    public void setArray(Round[] array) {
        this.array = array;
    }

    public Flat getFlat() {
        return flat;
    }

    public void setFlat(Flat flat) {
        this.flat = flat;
    }

    public BottleShape getBottleShape() {
        return bottleShape;
    }

    public void setCylindrical(BottleShape bottleShape) {
        this.bottleShape = bottleShape;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("Backpack №%s: %s | %s | %s", id, getCount(), flat, bottleShape);
    }

    private String getCount() {
        int countApple = 0;
        int countTennis = 0;
        for (Round round : this.array) {
            if (round instanceof Apple) {
                countApple++;
            }
            if (round instanceof TennisBalls) {
                countTennis++;
            }
        }
        if(countApple != 0 && countTennis == 0) {
            return countApple + " Apples";
        }
        if(countApple == 0 && countTennis != 0) {
            return countTennis + " Tennis Balls";
        }
        if(countApple != 0 & countTennis != 0) {
            return countApple + " Apples, " + countTennis + " Tennis Balls";
        }
        return "";
    }
}

