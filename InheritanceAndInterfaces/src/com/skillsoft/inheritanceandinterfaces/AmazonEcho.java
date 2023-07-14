package com.skillsoft.inheritanceandinterfaces;

public class AmazonEcho extends SmartSpeaker {

    public AmazonEcho() {
        super("Amazon Echo");
    }

    public void alexa() {
        System.out.println("Wake phrase: Alexa");
    }
}
