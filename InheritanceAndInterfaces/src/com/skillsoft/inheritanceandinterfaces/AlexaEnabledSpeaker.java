package com.skillsoft.inheritanceandinterfaces;

public class AlexaEnabledSpeaker extends SmartSpeaker {

    public AlexaEnabledSpeaker(String productName) {
        super(productName);
    }

    @Override
    public void wakePhrase() {
        System.out.println("Wake phrase: Alexa");
    }
}
