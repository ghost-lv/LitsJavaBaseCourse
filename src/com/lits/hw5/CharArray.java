package com.lits.hw5;

import java.util.Random;

public class CharArray extends Array{
    private char find;
    private char charArr[];
    CharArray () {
        super.count=defCount;
        super.arr = new int[count];
        charArr=new char[count];
    }
    CharArray (int count){
        super.count=count;
        super.arr = new int[count];
        charArr=new char[count];
    }
    void makeRandom(int maxRandom){
        int shift=32;

        super.makeRandom(maxRandom);
        for (int i=0; i<count; i++){
            arr[i]=new Random().nextInt(maxRandom)+shift;
            charArr[i]= (char) arr[i]; }
    }
    void makeConsistent (){
        for (int i=0; i<count;i++){
            arr[i]=i+1;
            charArr[i]=(char) arr[i];
        }
    }
    void print (String title) {
        System.out.println("\n" + title + ": ");
        for (int i=0; i<count;i++) {
            System.out.println("#" + i + ": " + charArr[i]); }
    }
    void checkSymbol(char symbol) {
        var found = false;
        for (char i:charArr) {
            if (found){break;}
            if(symbol==i){
                System.out.println("CharArray contains symbol " + symbol);
                found=true;}}
        if (found==false){
            System.out.println("Symbol '" + symbol + "' not found in CharArray");
        }
    }

}
