package Calculator;

public  class Calculate {
    private int arg1;
    private int arg2;
    private String operation;

    public Calculate (int arg1, int arg2, String operation) {
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.operation = operation;
    }

    public Calculate() {

    }

    public int getArg1() {
        return arg1;
    }

    public void setArg1(int arg1) {
        this.arg1 = arg1;
    }

    public int getArg2() {
        return arg2;
    }

    public void setArg2(int arg2) {
        this.arg2 = arg2;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public  int calculate() {
        switch (operation) {
            case "+":
                return (int) (arg1 + arg2);
            case "-":
                return (int) (arg1 - arg2);
            case "*":
                return (int) (arg1 * arg2);
            case "/":
                try {
                    return (int) (arg1 / arg2);
                } catch (ArithmeticException e) {
                    System.out.println("Деление на ноль!");
                }
            default:
                throw new UnsupportedOperationException("Не корректная операция, Введите +,-,/,*");
        }
    }
}
