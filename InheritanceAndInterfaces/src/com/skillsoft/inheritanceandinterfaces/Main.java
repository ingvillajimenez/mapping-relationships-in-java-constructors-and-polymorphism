package com.skillsoft.inheritanceandinterfaces;

public class Main {

    public static void main(String[] args) {

        SmartSpeaker smartSpeaker = new SmartSpeaker("Google Nest Audio");
        AlexaEnabledSpeaker amazonEchoDot = new AlexaEnabledSpeaker("Amazon Echo Dot");
        AmazonEcho amazonEcho = new AmazonEcho();
        AppleHomePod appleHomePod = new AppleHomePod();

        printWakePhrase(amazonEcho);
        printWakePhrase(amazonEchoDot);
        printWakePhrase(smartSpeaker);
        printWakePhrase(appleHomePod);
    }

    private static void printWakePhrase(SmartSpeaker speaker) {
        speaker.wakePhrase();
    }

//    private static void printWakePhrase(AlexaEnabledSpeaker speaker) {
//        speaker.wakePhrase();
//    }

//    private static void printWakePhrase(AmazonEcho speaker) {
//        speaker.wakePhrase();
//    }
}