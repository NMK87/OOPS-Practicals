package org.example.Polymorphism;

public class ShapeOverride {

    void draw(){
        System.out.println("shapes");
    }
}

class Circle extends ShapeOverride{
    void draw(){
        System.out.println("circle");
        }
    }
    class Rectangle extends ShapeOverride{
    void draw(){
        System.out.println("rectangle");
    }
    }