package com.lits.samples;

public class Person {
    public String name;
    public int age;

    public Person():
    public Person (String name){
        this.name=name;
    }
    public Person (String name, int age) {
        this.name=name;
        this.age=age;
    }

    public void sayHello() {
        System.out.println("Hello" + name);
    }

    public int  getAge(){
        return age;
    }

}
