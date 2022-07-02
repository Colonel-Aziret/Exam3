package Task3;

import Task3.BottleShape.Bottle;
import Task3.Flat.Book;
import Task3.Flat.Folder;
import Task3.Liquid.CocaCola;
import Task3.Liquid.Water;
import Task3.Round.Apple;
import Task3.Round.Round;
import Task3.Round.TennisBalls;

public class Main {

    // Task 3
    public static void main(String[] args) {
        Apple[] apples = new Apple[20];
        for (int i = 0; i < apples.length; i++) {
            apples[i] = new Apple();
        }
        Bag bag1 = new Bag(apples, new Book(), new Bottle(new CocaCola()));

        TennisBalls[] tennisBalls = new TennisBalls[50];
        for (int i = 0; i < tennisBalls.length; i++) {
            tennisBalls[i] = new TennisBalls();
        }
        Bag bag2 = new Bag(tennisBalls, new Folder(), new Bottle(new Water()));

        Round[] appleAndBalls = new Round[13];
        for (int i = 0; i < appleAndBalls.length; i++) {
            if (i < 10) {
                appleAndBalls[i] = new Apple();
            } else appleAndBalls[i] = new TennisBalls();
        }
        Bag bag3 = new Bag(appleAndBalls, new Folder(), new Bottle(new CocaCola()));

        System.out.println(bag1);
        System.out.println(bag2);
        System.out.println(bag3);
    }
}