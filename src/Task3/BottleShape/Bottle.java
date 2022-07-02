package Task3.BottleShape;

import Task3.Liquid.CocaCola;
import Task3.Liquid.Liquid;
import Task3.Liquid.Water;

public class Bottle extends BottleShape {
    private Liquid liquid;

    public Bottle(Liquid liquid) {
        this.liquid = liquid;
    }

    public Liquid getLiquid() {
        return liquid;
    }

    public void setLiquid(Liquid liquid) {
        this.liquid = liquid;
    }

    @Override
    public String toString() {
        return "Bottle of " + liquid;
    }
}

