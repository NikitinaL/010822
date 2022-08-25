package Calculator;

import java.math.BigDecimal;

public  class Calculate {
    public float arg1;
    public float arg2;
    public String operation;

    public  Calculate (float arg1, float arg2, String operation) {
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

    public  float calculation() {
        float result = 0;
        switch (operation) {
            case "+":
                result= (arg1 + arg2);
                break;
            case "-":
                result=  (arg1 - arg2);
                break;
            case "*":
                result=  (arg1 * arg2);
                break;
            case "/": {
                if (arg2==0){
                    throw new UnsupportedOperationException("Деление на ноль!");
                }
                result=  (arg1 / arg2);
                break;
            }
            default:
                throw new UnsupportedOperationException("Не корректная операция, Введите +,-,/,*");
        }
        return new BigDecimal(result).setScale(4, BigDecimal.ROUND_HALF_UP).floatValue();

    }
}
