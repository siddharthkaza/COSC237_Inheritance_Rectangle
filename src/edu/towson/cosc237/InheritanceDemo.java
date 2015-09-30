/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.towson.cosc237;

import java.util.Scanner;

/**
 *
 * @author 
 */
public class InheritanceDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double ll, ww, hh; //user input - used in calls to set() 
        Scanner input = new Scanner(System.in);
        
        Rectangle r1 = new Rectangle(); //superclass default constructor invoked 
        Rectangle r2 = new Rectangle(15.8, 25.3); //superclass alternate constructor invoked 
        
        Box b1 = new Box(); //subclass default constructor invoked 
        Box b2 = new Box(10.75, 27.5, 37); //subclass alternate constructor invoked 
        
        //Rectangle processing 
        System.out.print("First rectangle: ");
        r1.print();
        System.out.println("\n\t\tPerimeter of first rectangle: " + r1.perimeter());
        System.out.println("\t\tArea of first rectangle: " + r1.area());
        
        System.out.print("Second rectangle: ");
        r2.print();
        System.out.println("\n\t\tPerimeter of second rectangle: " + r2.perimeter());
        System.out.println("\t\tArea of second rectangle: " + r2.area());
        
        System.out.print("Enter length and width for first rectangle: ");
        ll = input.nextDouble();
        ww = input.nextDouble();
        r1.set(ll, ww);
        
        System.out.print("First rectangle after call to set: ");
        r1.print();
        
        System.out.println("\n\t\tPerimeter of first rectangle after call to set: " + r1.perimeter());
        System.out.println("\t\tArea of first rectangle after call to set: " + r1.area());
        
        System.out.print("After call to equals(superclass): ");
        if (r1.equals(r2)) {
            System.out.println("The 2 rectangles have the same dimensions");
        } else {
            System.out.println("The 2 rectangles don't have the same dimensions");
        }
        
        //Box processing 
        System.out.print("\nFirst box: ");
        b1.print();
        System.out.println("\n\t\tArea of first box: " + b1.area());
        System.out.println("\t\tVolume of first box: " + b1.volume());
        
        System.out.print("Second box: ");
        b2.print();
        System.out.println("\n\t\tArea of second box: " + b2.area());
        System.out.println("\t\tVolume of second box: " + b2.volume());
        
        System.out.print("Enter length, width and height for first box: ");
        ll = input.nextDouble();
        ww = input.nextDouble();
        hh = input.nextDouble();
        b1.set(ll, ww, hh);
        
        System.out.print("First box after call to set: ");
        b1.print();
        System.out.println("\n\t\tArea of first box after call to set: " + b1.area());
        System.out.println("\t\tVolume of first box after call to set:  " + b1.volume());
        
        System.out.print("After call to equals(subclass): ");
        if (b1.equals(b2)) {
            System.out.println("The 2 boxes have the same dimensions");
        } else {
            System.out.println("The 2 boxes don't have the same dimensions");
        }
        
        //We can use a Box object and put it into a reference to the Rectangle class
        //How does this happen? What are the advantages? 
        r1 = new Box();
        r1.print();
    }

}
