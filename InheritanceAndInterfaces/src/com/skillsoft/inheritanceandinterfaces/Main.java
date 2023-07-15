package com.skillsoft.inheritanceandinterfaces;

public class Main {

    public static void main(String[] args) {

        Measure measure = new Measure();

        System.out.println("\n****** Ambiguous method call *******\n");

        System.out.println("Area of rectangle in sq. cm (int, double): "
                + measure.area(5, 3));

//        System.out.println("\n****** Type promotion of input arguments *******\n");
//
//        System.out.println("Area of rectangle in sq. cm (int, float): "
//                + measure.area(4, 3.3f));
//
//        System.out.println("Area of rectangle in sq. cm (int, double): "
//                + measure.area(5, 3.4));
//
//        System.out.println("Area of rectangle in sq. cm (float, double): "
//                + measure.area(4.1f, 3.4));

//        System.out.println("Area of rectangle in sq. cm (integers): "
//                + measure.area(4, 3));
//
//        System.out.println("Area of rectangle in sq. cm (float): "
//                + measure.area(4.1f, 3.4f));
//
//        System.out.println("Area of rectangle in sq. cm (doubles): "
//                + measure.area(4.1, 3.4));
//
//        System.out.println("\n****** Mixed input *******\n");
//
//        System.out.println("Area of rectangle in sq. cm (float): "
//                + measure.area(4.6f, 3));
//
//        System.out.println("Area of rectangle in sq. cm (float): "
//                + measure.area(4, 3.7f));

//        System.out.println("Perimeter of rectangle in cm: "
//                + measure.perimeter(4, 3));
//
//        System.out.println("Perimeter of triangle in cm: "
//                + measure.perimeter(4, 3, 6));
//
//        System.out.println("Perimeter of square in cm: "
//                + measure.perimeter(5));
//
//        System.out.println("Area of rectangle in sq. cm: "
//                + measure.area(4, 3));

    }
}