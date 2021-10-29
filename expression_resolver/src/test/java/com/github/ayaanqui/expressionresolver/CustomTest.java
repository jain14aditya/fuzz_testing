package com.github.ayaanqui.expressionresolver;

import com.pholser.junit.quickcheck.From;
import edu.berkeley.cs.jqf.fuzz.Fuzz;

import static org.junit.Assert.assertTrue;

import edu.berkeley.cs.jqf.fuzz.JQF;
import org.junit.runner.RunWith;
@RunWith(JQF.class)
public class CustomTest {
    /**
     * Basic testing with addition fuzz
     */
    @Fuzz
    public void testAddFuzz(@From(ExpressionGenerator.class) String input) {
        Resolver calculator = new Resolver();
        String[] values = input.split("\\+");
        double a = Double.valueOf(values[0]);
        double b = Double.valueOf(values[1]);
        calculator.setExpression(input);
        assertTrue("Hello world = ", a + b == calculator.solveExpression().result);
    }

}
