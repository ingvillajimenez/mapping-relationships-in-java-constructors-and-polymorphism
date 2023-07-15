package com.skillsoft.inheritanceandinterfaces;

public class Measure {

    public int perimeter(int a, int b) {
        return (2 * (a + b));
    }

    public double perimeter(int a, int b, int c) {
        return (a + b + c);
    }

//    public double perimeter(int a, int b) {
//        return (2 * (a + b));
//    }

//    public int perimeter(int length, int breadth) {
//        return (2 * (length + breadth));
//    }

    public int area(int a, int b) {
        return (a * b);
    }

//    public double area(int a, int b) {
//        return (a * b);
//    }

//    public int area(int length, int breadth) {
//        return (length * breadth);
//    }
}