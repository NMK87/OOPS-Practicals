package org.example.Polymorphism;

import org.example.Polymorphism.Circle;
import org.example.Polymorphism.Rectangle;

public class MethodOverriding extends ShapeOverride {

    public static void main(String[] args) {
        ShapeOverride sh = new Rectangle();
        sh.draw();
        sh = new Circle();
        sh.draw();
        sh = new ShapeOverride();
        sh.draw();
    }
}
