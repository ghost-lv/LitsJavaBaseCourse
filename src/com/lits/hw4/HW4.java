package com.lits.hw4;

import java.util.Random;

public class HW4 {
    public static void main(String[] args) {
        int [] array = new int[100];
        for (int i =0 ; i<array.length; i++){
            array[i]= new Random().nextInt(1000);
        }
        Array numbers = new Array(100);
        numbers.arr=array;
        numbers.print("1. Array");
        numbers.sort();
        numbers.print("2. Sorted array");
        numbers.printPairElements();
        numbers.printUnpairIndexes();
        array=numbers.getSorted();
        System.out.println("\n"+ "5. Sorted local array: ");
        for (int i : array){
            System.out.print(i + " ");
        }
        numbers.updatePair(5);
        numbers.print("6. Pair elements pdated with number 5");
        numbers.makeRandom(25);
        numbers.print("7. Random");


    }
}
