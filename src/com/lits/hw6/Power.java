package com.lits.hw6;

public class Power implements Operation {
    @Override
    public double calculate(long a, long b) {
        long result;
        if (b>0){
            result=a;}
        else {result=0;}
        for (long i=2;i<=b;i++){
            result=result * a;
        }
        return result;
    }
}
