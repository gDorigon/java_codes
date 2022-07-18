package dev.dorigon.models.machines;

import dev.dorigon.models.products.HotDrink;
import dev.dorigon.models.products.Chocolate;

public class ChocolateMachine implements HotDrinkMachine {

    @Override
    public HotDrink makeDrink(){
        return  new Chocolate();
    }

}
