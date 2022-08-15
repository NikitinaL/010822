package NewYearSet;

public class Base {
    public static void main(String[] args) {
        Candys candys = new Candys("Fazer", "Набор новогодний 1", 250, 200);
        Chocolate choc = new Chocolate("Milka", "Набор новогодний 1", 100, 100);

        Set[] set1 = {candys, choc};
        for (Set someSet : set1) {
            System.out.println(someSet.toString());

        }
    }
}
