package NYGift;

public class Sweet {
    private  String name;
    private  double price = 0;
    private double weight = 0;
    private int quantity = 0;


    public Sweet(String name) {
        this.name = name;
    }

    public Sweet(String name, double price, double weight, int quantity) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public  String toString() {
        return name + " цена " + price + " вес " + weight ;
    }
}