package NewYearSet;

public class Base {
    public static void main(String[] args) {
        Candys candys = new Candys("Fazer", "Набор новогодний ", 250, 200);
        Chocolate choc = new Chocolate("Milka", "Набор новогодний ", 100, 100);

        float totalPrice = 0;
        float totalWeight = 0;

        Set[] set1 = {candys, choc};
        for (Set someSet : set1) {
            System.out.println(someSet.toString());
                totalPrice = totalPrice + someSet.getPrice();
                totalWeight = totalWeight + someSet.getWeight();
            }
        System.out.println(totalPrice);
        System.out.println(totalWeight);

        }
    }

