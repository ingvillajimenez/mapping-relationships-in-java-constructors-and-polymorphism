package com.skillsoft.inheritanceandinterfaces;

public class SelfHelpBook extends Book {
    public SelfHelpBook(String name) {
        super(name);

        System.out.println("SelfHelpBook: parameterized constructor");
    }

//    public SelfHelpBook() {

//        super("self help book - name placeholder");

//        System.out.println("SelfHelpBook: default no-argument constructor");
//    }
}
