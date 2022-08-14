package Calculator;

public class Calculate extends ChooseOperation {
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


