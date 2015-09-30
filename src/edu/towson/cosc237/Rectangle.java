/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.towson.cosc237;

/**
 *
 * @author 
 */
public class Rectangle {

    private double length;
    private double width;

    //superclass: empty constructor 
    public Rectangle() {
        length = 0;
        width = 0;
    }

    //superclass: alternate constructor 
    public Rectangle(double l, double w) {
        length = (l >= 0) ? l : 0;
        width = (w >= 0) ? w : 0;
    }

    public void set(double l, double w) {
        length = (l >= 0) ? l : 0;
        width = (w >= 0) ? w : 0;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }

    public void print() {
        System.out.print("Length = " + length + "; Width = " + width);
    }

    @Override   //overriding from the object 
    public String toString() {
        return "Length = " + length + "; Width = " + width;
    }

    public boolean equals(Rectangle r) {
        return length == r.length && width == r.width;
    }
}
