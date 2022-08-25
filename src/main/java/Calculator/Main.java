package Calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        float arg1 = 0;
        float arg2 = 0;
        try {
            System.out.print("Введите число 1: ");
            arg1 = in.nextFloat();
            System.out.print("Введите число 2: ");
            arg2 = in.nextFloat();
        } catch (InputMismatchException e) {
            System.err.println("Введите число");
            return;
        }
        System.out.print("Введите операцию: ");
        String operation = sc.nextLine();
        Calculate calculate = new Calculate();
        calculate.setArg1(arg1);
        calculate.setArg2(arg2);
        calculate.setOperation(operation);
        float result = 0;
        try {
            result = calculate.calculation();
            System.out.println( result);
            System.out.println("");
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return;
        }

        in.close();
        sc.close();

    }

}


