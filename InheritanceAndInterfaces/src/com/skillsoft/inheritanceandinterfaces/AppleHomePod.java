package com.skillsoft.inheritanceandinterfaces;

public class AppleHomePod extends SmartSpeaker {

    public AppleHomePod() {
        super("Apple HomePod");
    }

    @Override
    public void wakePhrase() {
        System.out.println("Wake phrase: Hey Siri");
    }
}

