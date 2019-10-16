package com.lits.hw6;

public class Division implements Operation {
    @Override
    public double calculate(long a, long b) {
        if (b==0) {return 0;}
        else {return a / b;}
    }
}
