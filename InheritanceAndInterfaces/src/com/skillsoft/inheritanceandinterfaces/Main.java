package com.skillsoft.inheritanceandinterfaces;

public class Main {

    public static void main(String[] args) {

        Measure measure = new Measure();

        System.out.println("Perimeter of rectangle in cm: "
                + measure.perimeter(4, 3));

        System.out.println("Perimeter of triangle in cm: "
                + measure.perimeter(4, 3, 6));

        System.out.println("Area of rectangle in sq. cm: "
                + measure.area(4, 3));

    }
}