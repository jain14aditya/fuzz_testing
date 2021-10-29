package com.github.ayaanqui.expressionresolver.MathClasses;

public class Fact {
    public static Double fact(Double[] a) {
        double factorial = 1;
        for (int i = a[0].intValue(); i > 1; i--)
            factorial *= i;
        return factorial;
    }
}
