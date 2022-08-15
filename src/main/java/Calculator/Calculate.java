package Calculator;

public  class Calculate {
    private float arg1;
    private float arg2;
    private String operation;

    public Calculate (float arg1, float arg2, String operation) {
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.operation = operation;
    }

    public Calculate() {

    }

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

    public  float calculate() {
        switch (operation) {
            case "+":
                return (float) (arg1 + arg2);
            case "-":
                return (float) (arg1 - arg2);
            case "*":
                return (float) (arg1 * arg2);
            case "/":
                return (float) (arg1 / arg2);
            default:
                throw new UnsupportedOperationException("Не корректная операция, Введите +,-,/,*");
        }
    }
}
