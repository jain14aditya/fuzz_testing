package com.github.ayaanqui.expressionresolver.MathClasses;

import java.util.Arrays;

public class Sum {
    public static Double sum(Double[] a) {
        return Arrays.stream(a).reduce(0.0, (total, arg) -> total += arg);
    }
}
