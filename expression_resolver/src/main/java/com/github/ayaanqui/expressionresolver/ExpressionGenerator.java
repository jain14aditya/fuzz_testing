package com.github.ayaanqui.expressionresolver;

import com.pholser.junit.quickcheck.generator.GenerationStatus;
import com.pholser.junit.quickcheck.generator.Generator;
import com.pholser.junit.quickcheck.random.SourceOfRandomness;

import java.rmi.MarshalException;
import java.util.ArrayList;


public class ExpressionGenerator extends Generator<String>{
    public ExpressionGenerator() {
        super(String.class);
    }

    public String generate_functions(SourceOfRandomness random) {
        ArrayList<String> operations = new ArrayList<String>();
        operations.add("sin");
        operations.add("cos");
        operations.add("tan");
        operations.add("ln");

        int index = (int)(Math.random() * operations.size());
        double a = random.nextDouble();

        return operations.get(index).concat("(").concat(String.valueOf(a)).concat(")");
    }

    public String generate_arithmetic(SourceOfRandomness random) {
        ArrayList<String> operations = new ArrayList<String>();
        operations.add("+");
        operations.add("-");
        operations.add("*");
        operations.add("/");

        int index = (int)(Math.random() * operations.size());
        double a = random.nextDouble();
        double b = random.nextDouble();
        return String.valueOf(a).concat(operations.get(index)).concat(String.valueOf(b));
    }

    @Override
    public String generate(SourceOfRandomness random, GenerationStatus __ignore__) {

        int idx = (int)(Math.random() * 2);

        switch (idx) {
            case 0: {
                return generate_arithmetic(random);
            }
            case 1: {
                return generate_functions(random);
            }
        }

        return "";
    }
}
