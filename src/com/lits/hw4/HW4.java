package com.lits.hw4;

import java.util.Random;

public class HW4 {
    public static void main(String[] args) {
        int [] array = new int[100];
        for (int i =0 ; i<array.length; i++){
            array[i]= new Random().nextInt(1000);
        }
        Array Numbers = new Array(100);
        Numbers.arr=array;
        Numbers.print("1. Array");
        Numbers.sort();
        Numbers.print("2. Sorted array");
        Numbers.printPairElements();
        Numbers.printUnpairIndexes();
        array=Numbers.getSorted();
        System.out.println("\n"+ "5. Sorted local array: ");
        for (int i : array){
            System.out.print(i + " ");
        }
        Numbers.updatePair(5);
        Numbers.print("6. Pair elements pdated with number 5");
        Numbers.makeRandom(25);
        Numbers.print("7. Random");


    }
}
