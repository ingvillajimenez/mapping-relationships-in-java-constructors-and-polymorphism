package com.skillsoft.inheritanceandinterfaces;

public class Main {
    public static void main(String[] args) {

        SmartSpeaker googleNestAudio = new GoogleNestAudio();
        SmartSpeaker amazonEcho = new AmazonEcho();
        SmartSpeaker appleHomePod = new AppleHomePod();
        SmartSpeaker sonosOne = new SonosOne();


        System.out.println("amazonEcho wakePhrase():");
        amazonEcho.wakePhrase();

        System.out.println("sonosOne wakePhrase():");
        sonosOne.wakePhrase();

        System.out.println("googleNestAudio wakePhrase():");
        googleNestAudio.wakePhrase();

        System.out.println("appleHomePod wakePhrase():");
        appleHomePod.wakePhrase();

        System.out.println();

        amazonEcho.printDetails();
        sonosOne.printDetails();
        googleNestAudio.printDetails();
        appleHomePod.printDetails();

//        SmartSpeaker googleNestAudio = new GoogleNestAudio();
//        SmartSpeaker amazonEcho = new AmazonEcho();
//        SmartSpeaker appleHomePod = new AppleHomePod();
//        SmartSpeaker sonosOne = new SonosOne();
//
//        System.out.println("googleNestAudio name: " + googleNestAudio.getProductName());
//        System.out.println("amazonEcho name: " + amazonEcho.getProductName());
//        System.out.println("appleHomePod name: " + appleHomePod.getProductName());
//        System.out.println("sonosOne name: " + sonosOne.getProductName());
//
//        System.out.println();
//
//        googleNestAudio.wakePhrase();
//        appleHomePod.wakePhrase();
//        amazonEcho.wakePhrase();
//        sonosOne.wakePhrase();
    }
}