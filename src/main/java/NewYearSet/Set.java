package NewYearSet;

public abstract class Set {
    private String brand;
    private String setName;
    private int price;

    public Set(String brand, String setName, int price) {
        this.brand = brand;
        this.setName = setName;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSetName() {
        return setName;
    }

    public void setSetName(String setName) {
        this.setName = setName;
    }

    public int getPrice(int price) {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Set{" +
                "brand='" + brand + '\'' +
                ", setName='" + setName + '\'' +
                ", price=" + price +
                '}';
    }


}

