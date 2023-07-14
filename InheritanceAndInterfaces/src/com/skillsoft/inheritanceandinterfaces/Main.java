package com.skillsoft.inheritanceandinterfaces;

public class Main {
    public static void main(String[] args) {

        Book coreJava = new Book("Core Java", "Cay S. Horstmann");
        System.out.println("coreJava: " + coreJava);

        System.out.println();


        SelfHelpBook thePowerOfHabit = new SelfHelpBook("The Power of Habit",
                "Charles Duhigg", 450);
        System.out.println("thePowerOfHabit: " + thePowerOfHabit);

        System.out.println();

//        Book headFirstJava = new Book();
//        System.out.println("headFirstJava: " + headFirstJava);
//
//        System.out.println();
//
//        Book effectiveJava = new Book("Effective Java");
//        System.out.println("effectiveJava" + effectiveJava);
//
//        System.out.println();
//
//        Book coreJava = new Book("Core Java", "Cay S. Horstmann");
//        System.out.println("coreJava: " + coreJava);
//
//        System.out.println();
//
//        SelfHelpBook algorithmsToLiveBy = new SelfHelpBook();
//        System.out.println("algorithmsToLiveBy: " + algorithmsToLiveBy);
//
//        System.out.println();
//
//        SelfHelpBook twoAwesomeHours = new SelfHelpBook("Two Awesome Hours");
//        System.out.println("twoAwesomeHours: " + twoAwesomeHours);
//
//        System.out.println();
//
//        SelfHelpBook thePowerOfHabit = new SelfHelpBook("The Power of Habit", "Charles Duhigg");
//        System.out.println("thePowerOfHabit: " + thePowerOfHabit);
//
//        System.out.println();
    }
}