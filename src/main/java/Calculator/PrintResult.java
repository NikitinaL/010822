package Calculator;

public  class PrintResult extends Calculate {

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

    public static void main(String[] args) {


        float arg1 = 0;
        float arg2 = 0;
        int operation=0;
        //System.out.printf(String.format("Итого "+"%.4f%n",Calculate.calculate(arg1,arg2, String.valueOf(operation))));
    }

    public PrintResult() {
        super();

    }
}

