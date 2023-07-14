package com.skillsoft.inheritanceandinterfaces;

public class GoogleNestAudio extends SmartSpeaker {

    public GoogleNestAudio() {
        super("Google Nest Audio");
    }

    @Override
    public void wakePhrase() {
        System.out.println("Wake phrase: OK Google");
    }
}
