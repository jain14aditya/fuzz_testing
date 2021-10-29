package com.github.ayaanqui.expressionresolver.MathClasses;

import java.util.Arrays;
import java.util.stream.Stream;

public class Avg {
    public static Double avg(Double[] a) {
        double sum = Arrays.stream(a).reduce(0.0, (total, arg) -> total += arg);
        return sum / a.length;
    }
}
