package NYGift;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Chocolate chocolate = new Chocolate("Fazer", 250, 200, 0);
        Cookie cookie = new Cookie("Milka", 100, 100, 0);

        double totalPrice = 0;
        double totalWeight = 0;
        System.out.println(chocolate.toString());
        System.out.println(cookie.toString());
        System.out.println("Сколько шоколадок");
        Scanner choc = new Scanner(System.in);
        int chocQuantity = choc.nextInt();
        System.out.println("Сколько печенья");
        Scanner cook = new Scanner(System.in);
        int cookQuantity = cook.nextInt();
        int totalQuantity = chocQuantity + cookQuantity;


        Sweet[] giftBox = new Sweet[totalQuantity];
        for (int i = 0; i < chocQuantity; i++) {
            giftBox[i] = new Chocolate("Fazer", 250, 200, 0);
        }
        for (int i = chocQuantity; i < totalQuantity; i++) {
            giftBox[i] = new Cookie("Milka", 100, 100, 0);
        }
        for (int i = 0; i < totalQuantity; i++) {
            totalPrice = totalPrice + giftBox[i].getPrice();
            totalWeight = totalWeight + giftBox[i].getWeight();
        }

        System.out.println("Общая цена подарка " + totalPrice);
        System.out.println("Общий вес подарка " + totalWeight);
        System.out.println("Общиее количество " + totalQuantity);


    }

}

