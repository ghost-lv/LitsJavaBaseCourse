package com.lits.hw5;

class IntegerArray extends Array {
//    protected int count;
//    protectedected intArray [] arr;
    private int sumAll;
    private int sumPairIndexes;
    private double avgAll;
    IntegerArray () {
        super.count=20;
        super.arr = new int[count];
    }
    IntegerArray (int count){
        super.count=count;
        super.arr = new int[count];
    }
    int getSumAll() {
        sumAll=0;
        for (int i:arr){
                sumAll=sumAll+i;}
        return sumAll;
    }
    int getSumPairIndexes() {
        sumPairIndexes=0;
        for (int i=0; i<count; i++){
            if (i % 2 == 0){
                sumPairIndexes=sumPairIndexes+arr[i];}}
        return sumPairIndexes;
    }
    double getAvgAll() {
        avgAll=(double) getSumAll()/count;
        return avgAll;
    }
}
