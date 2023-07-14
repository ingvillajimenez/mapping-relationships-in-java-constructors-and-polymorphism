package com.skillsoft.inheritanceandinterfaces;

public class Book {

    private String name = "unknown";

    public Book() {
        System.out.println("Book()");
    }

    public Book(String name) {
        this.name = name;

        System.out.println("Book(String name)");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void checkOutBook() {
        System.out.format("The book: %s has been checked out successfully!", name);
    }

    @Override
    public String toString() {
        return String.format("Name: %s", name);
    }
}
