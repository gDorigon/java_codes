package dev.dorigon.models.products;

public class Coffe {

    private int  quantity = 3;
    private int temperature = 3;
    private int sugar = 3;
    public Coffe() {};

    @Override
    public String toString() {
        return "{" +
                "quantity=" + quantity +
                ", temperature=" + temperature +
                ", sugar=" + sugar +
                '}';
    }
}


