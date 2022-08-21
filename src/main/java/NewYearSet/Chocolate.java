package NewYearSet;

public class Chocolate extends Set {
    private int weight;
    public Chocolate(String brand, String setName, int price,int weight) {
        super(brand, setName, price);
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Шоколадка   [" + super.toString()+ ",  вес= "+ weight+"]";
    }
}
