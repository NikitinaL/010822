

import java.io.StringReader;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Выберите задание \n1-калькулятор\n2-массив ");
        int task = num.nextInt();
        if (task == 1) {
            float calc = (float) calculate();
        } else if (task == 2) {
            int max = TheLongestWordFinder();
        } else {
            System.out.println("Ошибка в запросе");
        }
        num.close();
    }

    public static int calculate() {
        Scanner in = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число 1: ");
        float arg1 = in.nextFloat();
        System.out.print("Введите число 2: ");
        float arg2 = in.nextFloat();
        System.out.print("Введите операцию: ");
        String operation = sc.nextLine();
        System.out.printf(String.format("Итого " + "%.4f%n", calculation(arg1, arg2, operation)));
        in.close();
        sc.close();
        return 0;
    }


    public static float calculation(float arg1, float arg2, String operation) {
        switch (operation) {
            case "+":
                return (float) (arg1 + arg2);
            case "-":
                return (float) (arg1 - arg2);
            case "/":
                return (float) (arg1 / arg2);
            case "*":
                return (float) (arg1 * arg2);
            default:
                throw new UnsupportedOperationException("Не корректная операция, Введите +,-,/,*");

        }
    }

    public static <string> int TheLongestWordFinder() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = in.nextInt();
        Scanner sc = new Scanner(System.in);
        String[] words = new String[size];
        int maxlength = 0;
        for (int i = 0; i < words.length; i++) {
            System.out.printf("Введите слово № %d: %n", i + 1);
            words[i] = sc.nextLine();   // здесь слово сохраняется в массиве и следом с помощью условия ищется индекс слова наибольшей длины
            if (words.length > words[maxlength].length()) {
                maxlength = i;
            }
        }
        System.out.println("Самое длинное слово " + words[maxlength]);
        sc.close();
        return maxlength;
    }
}




