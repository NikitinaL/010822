package Calculator;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.rules.ExpectedException;

import java.util.InputMismatchException;

class CalculateTest {

    Calculate calculate;

    @BeforeEach
    void preparedata() {
        calculate = new Calculate(10.5f, 25.2f, "+");
    }

    @org.junit.jupiter.api.Test
    void calculate() {

        Assertions.assertEquals(10.5f, calculate.getArg1());
        Assertions.assertEquals(25.2f, calculate.getArg2());
        Assertions.assertEquals("+", calculate.getOperation());
    }

    @org.junit.jupiter.api.Test
    void getArg1() {
        Assertions.assertEquals(10.5f, calculate.getArg1());
    }

    @org.junit.jupiter.api.Test
    void setArg1() {
        calculate.setArg1(15.5f);
        Assertions.assertEquals(15.5f, calculate.getArg1());

    }

    @org.junit.jupiter.api.Test
    void getArg2() {
        Assertions.assertEquals(25.2f, calculate.getArg2());

    }

    @org.junit.jupiter.api.Test
    void setArg2() {
        calculate.setArg2(3.99f);
        Assertions.assertEquals(3.99f, calculate.getArg2());

    }

    @org.junit.jupiter.api.Test
    void getOperation() {
        Assert.assertEquals("+", calculate.getOperation());
    }

    @org.junit.jupiter.api.Test
    void isSetOperationDelenie() {
        calculate.setOperation("/");
        Assert.assertEquals("/", calculate.getOperation());
    }

    @org.junit.jupiter.api.Test
    void isSetOperationPlus() {
        calculate.setOperation("+");
        Assert.assertEquals("+", calculate.getOperation());
    }

    @org.junit.jupiter.api.Test
    void isSetOperationMinus() {
        calculate.setOperation("-");
        Assert.assertEquals("-", calculate.getOperation());
    }

    @org.junit.jupiter.api.Test
    void isSetOperationInc() {
        calculate.setOperation("*");
        Assert.assertEquals("*", calculate.getOperation());
    }


    @org.junit.jupiter.api.Test
    void isOperationPlus() {
        Calculate calculate = new Calculate(10.2222f, 10.4444f, "+");
        Assertions.assertEquals(20.6666f, calculate.calculation());

    }

    @org.junit.jupiter.api.Test
    void isOperationDelenie() {
        Calculate calculate = new Calculate(10f, 3f, "/");
        Assertions.assertEquals(3.3333f, calculate.calculation());

    }

    @org.junit.jupiter.api.Test
    void isOperationMinus() {
        Calculate calculate = new Calculate(3.5f, 1.25f, "-");
        Assertions.assertEquals(2.25f, calculate.calculation());

    }

    @org.junit.jupiter.api.Test
    void isOperationInc() {
        Calculate calculate = new Calculate(3.5f, 3.5f, "*");
        Assertions.assertEquals(12.25f, calculate.calculation());

    }

    @org.junit.jupiter.api.Test
    void testException() throws Exception {
        Exception exception = Assertions.assertThrows(InputMismatchException.class,()->{

        });
        Assertions.assertEquals("Введите число",exception.getMessage());
    }
}