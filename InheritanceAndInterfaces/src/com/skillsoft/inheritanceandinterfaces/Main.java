package com.skillsoft.inheritanceandinterfaces;

public class Main {
    public static void main(String[] args) {

        Book headFirstJava = new Book();
        System.out.println("headFirstJava name: " + headFirstJava.getName());

        System.out.println();

        Book effectiveJava = new Book("Effective Java");
        System.out.println("effectiveJava name: " + effectiveJava.getName());

        System.out.println();

        SelfHelpBook algorithmsToLiveBy = new SelfHelpBook();
        System.out.println("algorithmsToLiveBy name: " + algorithmsToLiveBy.getName());

        System.out.println();

        SelfHelpBook twoAwesomeHours = new SelfHelpBook("Two Awesome Hours");
        System.out.println("twoAwesomeHours name: " + twoAwesomeHours.getName());

        System.out.println();
    }
}