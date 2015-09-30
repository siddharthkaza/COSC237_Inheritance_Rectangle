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
public class Box extends Rectangle {

    private double height;

    //subclass empty constructor 
    public Box() {
        super();
        height = 0;
    }

    //subclass alternate constructor 
    public Box(double l, double w, double h) {
        super(l, w);
        height = h;
    }

    //Method set: will overload same method from superclass 
    //compare this to the overriding methods. What is the difference you think?
    public void set(double l, double w, double h) {
        super.set(l, w);
        height = (h >= 0) ? h : 0;
    }

    public double getHeight() {
        return height;
    }

    /**
     * will override same method from superclass 
     * @return
     */
    @Override
    public double area() {
        return 2 * (getLength() * getWidth() + getLength() * height + getWidth() * height);
    }

    public double volume() {
        return super.area() * height;
    }

    /**
     * will override same method from superclass 
     */
    @Override
    public void print() {
        super.print();
        System.out.print("; Height = " + height);
    }

    //Method toString: will override same method from superclass 
    @Override
    public String toString() {
        return super.toString() + "; Height = " + height;
    }

    //Method equals: will overload same method from superclass 
    public boolean equals(Box b) {
        //return getLength() == b.getLength() && getWidth() == b.getWidth() && height == b.height; 
        //return super.equals(new Rectangle(b.getLength(), b.getWidth())) && height == b.height; 
        return super.equals(b) && height == b.height;
        //the call to super works because b is an object of class Box, but also an object of class Rectangle 
    }
}
