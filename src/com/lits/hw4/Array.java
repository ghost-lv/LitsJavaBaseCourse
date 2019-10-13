package com.lits.hw4;

import java.util.Random;

class Array {
    public int count;
    public int [] arr;

    public Array () {
        count=100;
        arr = new int[count];
    }
    public Array (int count){
        this.count=count;
        arr = new int[count];
    }
    public Array (int [] arr ){
        this.arr=arr;
    }
    public void print(String title){
        System.out.println("\n" + title + ": ");
        for (int i:arr) {
            System.out.print(i + " "); }
    }
    public void sort(){
        var inputLength = arr.length;
        int temp;
        boolean is_sorted;
        for (int i = 0; i < inputLength; i++) {
            is_sorted = true;
            for (int j = 1; j < (inputLength - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    is_sorted = false; } }
        if (is_sorted) break; }
        //System.out.println("\n" + "2. Sorted array: ");
        //print();
    }
    public void printPairElements(){
        System.out.println("\n" + "3. Pair elements: ");
        for (int i:arr) {
            if (i%2==0){
                System.out.print(i + " "); } }
    }
    public void printUnpairIndexes(){
        System.out.println("\n" + "4. Unpair indexes: ");
        for (int i=0; i<count; i++){
            if (i % 2 > 0){
                System.out.print(arr[i] + " ");
            }
        }
    }
    public int [] getSorted(){
        sort();
        return arr;
    }
    public void updatePair(int number){
        for (int i=0; i<count; i++){
            if (i % 2 == 0){
                arr[i]=number; } }
    }
    public void makeRandom(int maxRandom){
        for (int i=0; i<count; i++){
            arr[i]=new Random().nextInt(maxRandom); }
    }


}
