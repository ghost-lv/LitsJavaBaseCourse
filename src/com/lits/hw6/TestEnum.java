package com.lits.hw6;

public class TestEnum {
    public static void main(String[] args) {
        Cars a = Cars.HONDA;
        //System.out.println(Cars.AUDI.getCountry());
        System.out.println(Cars.findById(10));
        System.out.println(Cars.findByCode("ZAZ"));
        System.out.println(Cars.findByCountry("DE"));
    }
}
