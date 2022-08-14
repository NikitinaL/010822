package Calculator;

public class PrintResult extends Calculate {

    public static void main(String[] args) {

        float arg2 = 0;
        String operation = null;
        float arg1 = 0;
        System.out.printf(String.format("Итого "+"%.4f%n",Calculate.Calculate(arg1,arg2,operation)));
    }

    public PrintResult() {

    }
}

