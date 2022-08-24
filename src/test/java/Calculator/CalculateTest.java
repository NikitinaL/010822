package Calculator;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

class CalculateTest {

    Calculate calculate;

    @BeforeEach
    void preparedata()
        {
            calculate= new Calculate(10,25,"+");
    }

    @org.junit.jupiter.api.Test
    void calculate() {

        Assert.assertEquals(10,calculate.getArg1());
        Assert.assertEquals(25,calculate.getArg2());
        Assert.assertEquals("+",calculate.getOperation());
    }

    @org.junit.jupiter.api.Test
    void getArg1() {
        Assert.assertEquals(10,calculate.getArg1());
    }

    @org.junit.jupiter.api.Test
    void setArg1() {
        calculate.setArg1(15);
        Assert.assertEquals(15,calculate.getArg1());

    }

    @org.junit.jupiter.api.Test
    void getArg2() {
        Assert.assertEquals(25,calculate.getArg2());

    }

    @org.junit.jupiter.api.Test
    void setArg2() {
        calculate.setArg2(3);
        Assert.assertEquals(3,calculate.getArg2());

    }

    @org.junit.jupiter.api.Test
    void getOperation() {
        Assert.assertEquals("+",calculate.getOperation());
    }

    @org.junit.jupiter.api.Test
    void setOperation() {
        calculate.setOperation("/");
        Assert.assertEquals("/",calculate.getOperation());
    }

    @org.junit.jupiter.api.Test
    void isOperationAddition() {
        Calculate calculate= new Calculate(10,25,"+");
        Assert.assertEquals(35,calculate.calculation());

    }
    @org.junit.jupiter.api.Test
    void isOperationDiv() {
        Calculate calculate= new Calculate((float) 5, (float) 2,"/");
        Assertions.assertEquals(2.5, calculate.calculation());

    }

    @org.junit.jupiter.api.Test
    void isOperationSub() {
        Calculate calculate= new Calculate((float) 5.598, (float) 3.9,"-");
        Assertions.assertEquals(1.6980, calculate.calculation());

    }

    @org.junit.jupiter.api.Test
    void isOperationInc() {
        Calculate calculate= new Calculate(3.5f, 3.5f,"*");
        Assertions.assertEquals(12.25f, calculate.calculation());
    }
}