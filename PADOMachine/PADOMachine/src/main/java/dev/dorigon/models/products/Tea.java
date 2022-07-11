package dev.dorigon.models.products;

public class Tea {

    private int  quantity = 3;
    private int temperature = 3;
    private int sugar = 3;


    public Tea() {};

    @Override
    public String toString() {
        return "{" +
                "quantity=" + quantity +
                ", temperature=" + temperature +
                ", sugar=" + sugar +
                '}';
    }
}
