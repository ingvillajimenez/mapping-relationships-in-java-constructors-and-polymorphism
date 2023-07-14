package com.skillsoft.inheritanceandinterfaces;

public class Main {
    public static void main(String[] args) {

        Book headFirstJava = new Book("Head First Java");
        System.out.println("headFirstJava name: " + headFirstJava.getName());

        Book effectiveJava = new Book("Effective Java");
        System.out.println("effectiveJava name: " + effectiveJava.getName());

        SelfHelpBook algorithmsToLiveBy = new SelfHelpBook();
        System.out.println("algorithmsToLiveBy name: " + algorithmsToLiveBy.getName());

        SelfHelpBook twoAwesomeHours = new SelfHelpBook();
        System.out.println("twoAwesomeHours name: " + twoAwesomeHours.getName());
    }
}