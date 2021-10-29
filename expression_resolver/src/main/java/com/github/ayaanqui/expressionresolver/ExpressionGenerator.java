package com.github.ayaanqui.expressionresolver;

import com.pholser.junit.quickcheck.generator.GenerationStatus;
import com.pholser.junit.quickcheck.generator.Generator;
import com.pholser.junit.quickcheck.random.SourceOfRandomness;


public class ExpressionGenerator extends Generator<String>{
    public ExpressionGenerator() {
        super(String.class);
    }

    @Override
    public String generate(SourceOfRandomness random, GenerationStatus __ignore__) {
        // Initialize a calendar object

        // Randomly pick a day, month, and year
//        int a = random.nextInt();
//        int b = random.nextInt();
        double a = random.nextDouble();
        double b = random.nextDouble();
        return String.valueOf(a).concat("+").concat(String.valueOf(b));
    }
}
