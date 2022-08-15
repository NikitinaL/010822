package Calculator;

import java.util.Scanner;

public class ChooseOperation {
private  float arg1;
    private  float arg2;
    private  String operation;

    public float getArg1() {
        return arg1;
    }

    public void setArg1(float arg1) {
        this.arg1 = arg1;
    }

    public float getArg2() {
        return arg2;
    }

    public void setArg2(float arg2) {
        this.arg2 = arg2;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число 1: ");
        float arg1 = in.nextFloat();
        System.out.print("Введите число 2: ");
        float arg2 = in.nextFloat();
        System.out.print("Введите операцию: ");
        String operation = sc.nextLine();


    }
}
