import java.util.Scanner;

public class Task3_2 {
    public static void main(String[] args) {
        String[] arrCandy = new String[4];
        arrCandy[0] = "Конфеты в ассортименте";
        arrCandy[1] = "500гр";
        arrCandy[2] = "300руб";
        arrCandy[3] = "id1";

        String[] arrChoc = new String[4];
        arrChoc[0] = "Шоколадка Аленка";
        arrChoc[1] = "200гр";
        arrChoc[2] = "150руб";
        arrChoc[3] = "id2";

        String[] arrSweet = new String[4];
        arrSweet[0] = "Коробка конфет Коркунов";
        arrSweet[1] = "300гр";
        arrSweet[2] = "400руб";
        arrSweet[3] = "id3";

        String[] arrCookie = new String[4];
        arrCookie[0] = "Печенье Milka с шоколадом";
        arrCookie[1] = "100гр";
        arrCookie[2] = "149руб";
        arrCookie[3] = "id4";

        Scanner in = new Scanner(System.in);
        Scanner choice = new Scanner(System.in);
        System.out.print("Выберите набор: 1-Конфеты в ассортименте+Печенье Milka с шоколадом \n2-Шоколадка Аленка+Коробка конфет Коркунов");
        int nabor = in.nextInt();
        if (nabor == 1) {
            System.out.println("Стоимость набора 449р. Вес набора 400гр ");
        } else {
            System.out.println("Стоимость набора 550р. Вес набора 500гр");
        }

    }
}

