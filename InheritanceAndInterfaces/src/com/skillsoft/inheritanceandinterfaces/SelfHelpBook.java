package com.skillsoft.inheritanceandinterfaces;

public class SelfHelpBook extends Book {
    public SelfHelpBook() {
        super("some_random_name");

        System.out.println("SelfHelpBook()");
    }

    public SelfHelpBook(String name) {
        super();

        setName(name);

        System.out.println("SelfHelpBook(String name)");
    }

//    public SelfHelpBook() {
//        System.out.println("SelfHelpBook()");
//
//        super();
//    }
//
//    public SelfHelpBook(String name) {
//        System.out.println("SelfHelpBook(String name)");
//
//        super(name);
//    }

//    public SelfHelpBook() {
//        super();
//
//        System.out.println("SelfHelpBook()");
//    }
//
//    public SelfHelpBook(String name) {
//        super(name);
//
//        System.out.println("SelfHelpBook(String name)");
//    }
}
