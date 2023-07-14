package com.skillsoft.inheritanceandinterfaces;

public class SelfHelpBook extends Book {

    private int numberOfPages = -1;

    public SelfHelpBook() {
        System.out.println("SelfHelpBook()");
    }

    public SelfHelpBook(String name) {
        super(name);
        System.out.println("SelfHelpBook(String name)");
    }

    public SelfHelpBook(String name, String author) {
        super(name, author);
        System.out.println("SelfHelpBook(String name, String author)");
    }

    public SelfHelpBook(String name, String author, int numberOfPages) {
        super(name, author);

        this.numberOfPages = numberOfPages;

        System.out.println("SelfHelpBook(String name, String author, int numberOfPages)");
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    //    public SelfHelpBook() {
//        System.out.println("SelfHelpBook()");
//    }
//
//    public SelfHelpBook(String name) {
//        super(name);
//        System.out.println("SelfHelpBook(String name)");
//    }
//
//    public SelfHelpBook(String name, String author) {
//        super(name, author);
//        System.out.println("SelfHelpBook(String name, String author)");
//    }
}
