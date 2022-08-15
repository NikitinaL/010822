package NewYearSet;

public class Candys extends Set{
    private int weight;
    public Candys(String brand, String setName, int price, int weight) {
        super(brand, setName, price);
        this.weight=weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Candys{" +
                "weight='" + weight + '\'' +
                '}';
    }
}


