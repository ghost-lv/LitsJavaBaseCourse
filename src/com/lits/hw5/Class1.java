package com.lits.hw5;

public class Class1 {
    //evolution of classes
    int int1;
    private double dbl1;
    Array arr1;
    Class1 (int arrayLength){
        if (arrayLength<0){
            arrayLength=arrayLength*-1;
        }
        arr1=new Array(arrayLength);
        int1=arrayLength;
    }

}
