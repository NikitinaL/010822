package Calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число 1: ");
        int arg1 = (int) in.nextInt();
        System.out.print("Введите число 2: ");
        int arg2 = in.nextInt();
        System.out.print("Введите операцию: ");
        String operation = sc.nextLine();
        Calculate calculate = new Calculate();
        calculate.setArg1(arg1);
        calculate.setArg2(arg2);
        calculate.setOperation(operation);
        int result = calculate.calculate();
        System.out.println(result);
        in.close();
        sc.close();

    }
}
