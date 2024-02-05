package com.example.kodillaspring.calculator;

import com.example.kodillaspring.calculator.Calculator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    public void testCalculations() {
        System.out.println("Testing calculations...");

        // Test addition
        calculator.add(5, 3);

        // Test subtraction
        calculator.sub(8, 4);

        // Test multiplication
        calculator.mul(2, 6);

        // Test division
        calculator.div(10, 2);
    }
}
