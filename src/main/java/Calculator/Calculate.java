package Calculator;

public class Calculate extends ChooseOperation {
    @Override
    public void setArg1(float arg1) {
        super.setArg1(arg1);
    }

    @Override
    public void setArg2(float arg2) {
        super.setArg2(arg2);
    }

    @Override
    public void setOperation(String operation) {
        super.setOperation(operation);

    }

    @Override
    public float getArg1() {
        return super.getArg1();
    }

    @Override
    public float getArg2() {
        return super.getArg2();
    }

    @Override
    public String getOperation() {
        return super.getOperation();
    }

    public static float Calculate(float arg1, float arg2, String operation) {
        switch (operation) {
            case "+":
                return (float) (arg1 + arg2);
            case "-":
                return (float) (arg1 - arg2);
            default:
                throw new UnsupportedOperationException("Не корректная операция, Введите +,-,/,*");

        }
    }


}


