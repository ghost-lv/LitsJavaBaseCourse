package com.lits.lesson6;

public interface Messenger {

    int OPEN = 1;

    boolean sendMessage(String test);

    String receiveMessage();

    default void plus() {
        System.out.println(2 + 2);
    }

    static void something() {
        System.out.println("something");
    }
}
