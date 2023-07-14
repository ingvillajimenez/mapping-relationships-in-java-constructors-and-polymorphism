package com.skillsoft.inheritanceandinterfaces;

public class AmazonEcho extends SmartSpeaker {

    public AmazonEcho() {
        super("Amazon Echo");
    }

    public void wakePhrase() {
        System.out.println("Wake phrase: Alexa");
    }
}
