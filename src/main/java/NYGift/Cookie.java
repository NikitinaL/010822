package NYGift;

public class Cookie extends Sweet {

    String type = " Печенье овсяное";

    public Cookie(String name) {
        super(name);
    }

    public Cookie(String name, double price, double weight, int quantity) {
        super(name, price, weight, quantity);
    }

    @Override
    public String toString() {
        return super.toString() + type;
    }
}

