package dev.dorigon.models.machines;
import dev.dorigon.models.products.HotDrink;
import dev.dorigon.models.products.Tea;

public class TeaMachine implements HotDrinkMachine {

    @Override
    public HotDrink makeDrink() {
        return new Tea();
    }
}
