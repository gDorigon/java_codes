package dev.dorigon;

import dev.dorigon.models.machines.CoffeMachine;
import dev.dorigon.models.machines.TeaMachine;
import dev.dorigon.models.products.Coffe;
import dev.dorigon.models.products.Tea;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {



        System.out.println("Escolha sua bebida:");
        System.out.println("0 - Coffee");
        System.out.println("1 - Tea");
        System.out.println("Escolha : ");

        while(true){

            Scanner sc = new Scanner(System.in);
            int valor = Integer.parseInt(sc.nextLine());

            System.out.println("Valor escolhido : "+ valor);

            if(valor == 0){
                CoffeMachine coffeMachine = new CoffeMachine();
                Coffe coffe = coffeMachine.makeCoffe();
            }
            if(valor == 1){
                TeaMachine teaMachine = new TeaMachine();
                Tea tea = teaMachine.makeTea();
            }

        }









    }
}
