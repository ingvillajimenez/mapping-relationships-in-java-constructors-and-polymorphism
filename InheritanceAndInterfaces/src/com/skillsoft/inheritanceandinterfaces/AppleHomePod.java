package com.skillsoft.inheritanceandinterfaces;

public class AppleHomePod extends SmartSpeaker {
    public AppleHomePod() {
        super("Apple HomePod");
    }

    public void siri() {
        System.out.println("Wake phrase: Hey Siri");
    }
}
