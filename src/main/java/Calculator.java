/**
 * @author Nikitina Lyudmila
 *Task 1-Java advanced
 */

import java.util.Scanner;//импортируем класс сканер для вывода на консоль из java
public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //создаем объект на основе класса -класс используем как тип данных
        //new Scanner-выделение памяти System.in-значит будем данные от пользака получать
        Scanner sc = new Scanner(System.in);//создаем объект (sc-это название объект)
        System.out.print("Введите число 1: ");
        float arg1 = in.nextFloat(); // in.nextInt() - обращаемся к объекту и вызываем метод - программа ожидает ввод
        //int arg1-сохраняем данные которые вывеле в переменную arg1
        System.out.print("Введите число 2: ");
        float arg2 = in.nextFloat();
        System.out.print("Введите операцию: ");
        String operation = sc.nextLine();
        System.out.printf(String.format("Итого "+"%.4f%n",calculate(arg1,arg2,operation))); //"%.4f%n"-округляем до 4х зн
    }
    public static float calculate(float arg1, float arg2, String operation) {
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


