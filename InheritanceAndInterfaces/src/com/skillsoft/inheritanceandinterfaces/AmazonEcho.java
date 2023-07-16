package com.skillsoft.inheritanceandinterfaces;

public class AmazonEcho extends AlexaEnabledSpeaker {

    public AmazonEcho() {
        super("Amazon Echo");
    }

    @Override
    public void wakePhrase() {
        System.out.println("Wake phrase: Alexa/Echo");
    }
}
