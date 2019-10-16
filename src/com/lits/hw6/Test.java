package com.lits.hw6;

class Test {
    public static void main(String[] args) {
        Operation oper = new Sum();
        System.out.println(oper.calculate(5,10));
        oper = new Division();
        System.out.println(oper.calculate(25,5));
        oper = new Power();
        System.out.println(oper.calculate(10,2));
        oper = new Multiplication();
        System.out.println(oper.calculate(100,25));
    }
}
