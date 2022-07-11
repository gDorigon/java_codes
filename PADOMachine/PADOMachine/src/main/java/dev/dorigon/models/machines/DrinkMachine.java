package dev.dorigon.models.machines;



import dev.dorigon.models.products.HotDrink;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DrinkMachine {

    private List<HotDrinkMachine> machines = new ArrayList<>();

    public DrinkMachine() {

        CoffeMachine coffeMachine = new CoffeMachine();
        TeaMachine teaMachine = new TeaMachine();
        machines.add(coffeMachine);
        machines.add(teaMachine);
    }
    
    public void prepare(){

        System.out.println("Escolha sua bebida:");
        System.out.println("0 - Coffee");
        System.out.println("1 - Tea");
        System.out.println("Escolha : ");

        while (true){

            Scanner sc = new Scanner(System.in);
            int valor = Integer.parseInt(sc.nextLine());
            System.out.println("Valor escolhido : "+ valor);
            if(valor < machines.size() && valor >= 0){
                HotDrink hotDrink = this.machines.get(valor).makeDrink();
                System.out.println(hotDrink);
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }

        }


    }
}
