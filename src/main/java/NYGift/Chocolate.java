package NYGift;

public class Chocolate extends Sweet {

    String category = " Шоколад молочный";

    public Chocolate(String name) {
        super(name);
    }

    public Chocolate(String name, double price, double weight, int quantity) {
        super(name, price, weight, quantity);
    }

    @Override
    public String toString() {
        return super.toString() + category;
    }
}

