package com.lits.lesson6;

public class Telegram implements Messenger {
    private Messenger messenger;

    public Telegram(Messenger messenger) {
        this.messenger = messenger;
    }

    @Override
    public boolean sendMessage(String test) {
        System.out.println("Send via telegram");
        return true;
    }

    @Override
    public String receiveMessage() {
        String text = "Telegram";
        System.out.println(text);

        return text;
    }

//    public void plus() {
//        System.out.println(6);
//    }
}
