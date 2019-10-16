package com.lits.hw5;

public class TestCharArr {
    public static void main(String[] args) {
        CharArray characters;
        characters = new CharArray(10);
        characters.makeRandom(100);
        //characters.makeConsistent();
        characters.print("all");
        characters.checkSymbol('A');
    }
}
