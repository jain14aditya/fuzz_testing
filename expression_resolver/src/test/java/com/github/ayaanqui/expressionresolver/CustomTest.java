package com.github.ayaanqui.expressionresolver;
import java.util.HashMap;
import com.pholser.junit.quickcheck.From;
import edu.berkeley.cs.jqf.fuzz.Fuzz;
import java.util.regex.*;
import static org.junit.Assert.assertTrue;

import edu.berkeley.cs.jqf.fuzz.JQF;
import org.junit.runner.RunWith;
@RunWith(JQF.class)
public class CustomTest {
    /**
     * Basic testing with addition fuzz
     */
    @Fuzz
    public void testFuzz(@From(ExpressionGenerator.class) String input) {
        Resolver calculator = new Resolver();

        if(Pattern.compile("\\+|-|\\/|\\*").matcher(input).find()) {
            String[] values = input.split("\\+|-|\\/|\\*");

            double a = Double.valueOf(values[0]);
            double b = Double.valueOf(values[1]);
            calculator.setExpression(input);
            if (input.contains("+")) assertTrue("Hello world = ", a + b == calculator.solveExpression().result);
            if (input.contains("-")) assertTrue("Hello world = ", a - b == calculator.solveExpression().result);
            if (input.contains("/")) assertTrue("Hello world = ", a / b == calculator.solveExpression().result);
            if (input.contains("*")) assertTrue("Hello world = ", a * b == calculator.solveExpression().result);
        }

        else {
            String s = input.substring(input.indexOf("(") + 1);
            s = s.substring(0, s.indexOf(")"));

            double a = Double.valueOf(s);

            if (input.contains("sin")) assertTrue("Hello world = ", Math.sin(a) == calculator.solveExpression().result);
            if (input.contains("cos")) assertTrue("Hello world = ", Math.cos(a) == calculator.solveExpression().result);
            if (input.contains("tan")) assertTrue("Hello world = ", Math.tan(a) == calculator.solveExpression().result);
            if (input.contains("log")) assertTrue("Hello world = ", Math.log(a) == calculator.solveExpression().result);

        }
    }
}
