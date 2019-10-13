package com.lits.hw5;

import java.util.Random;

class Array {
    protected int count;
    protected int [] arr;
    private int sumUnpairIndexes;
    protected static int defCount=20;
    Array () {
        count=defCount;
        arr = new int[count];
    }
    Array (int count){
        if (count<0){count=count*-1; }
        else if (count==0){count=defCount;}
        this.count=count;
        arr = new int[count];
    }
    void makeRandom(int maxRandom){
        for (int i=0; i<count; i++){
            arr[i]=new Random().nextInt(maxRandom); }
    }
    void print(String title){
        System.out.println("\n" + title + ": ");
        for (int i:arr) {
            System.out.print(i + " "); }
    }
    int getSumUnpairIndexes() {
        sumUnpairIndexes=0;
        for (int i=0; i<count; i++){
            if (i % 2 != 0){
                sumUnpairIndexes=sumUnpairIndexes+arr[i];}}
        return sumUnpairIndexes;
    }
}
