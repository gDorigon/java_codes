package dev.dorigon.models.machines;

import dev.dorigon.models.products.Coffe;
import dev.dorigon.models.products.HotDrink;

public class CoffeMachine implements HotDrinkMachine{

    @Override
    public HotDrink makeDrink() {

        return new Coffe();
    }
}