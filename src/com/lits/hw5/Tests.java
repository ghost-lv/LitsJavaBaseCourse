package com.lits.hw5;

class Tests {
    public static void main(String[] args) {
        var sumAll=0;
        var sumPair=0;
        var sumUnpair=0;
        IntegerArray intArray= new IntegerArray(50);
        intArray.makeRandom(50);
        intArray.print("elements");
        sumAll=intArray.getSumAll();
        sumPair=intArray.getSumPairIndexes();
        sumUnpair=intArray.getSumUnpairIndexes();
        System.out.println(sumAll);
        System.out.println(sumPair + sumUnpair);
        System.out.println(intArray.getAvgAll());
    }
}
