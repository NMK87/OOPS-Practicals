package org.example.Polymorphism.ExampleOverriding;

public class MainFruits extends Fruits {

    public static void main(String[] args) {
        Fruits override = new Fruits();
        override.fruitsTaste();
        override = new Apple();
        override.fruitsTaste();
        override  =new Mango();
        override.fruitsTaste();
        override = new Orange();
        override.fruitsTaste();


    }
}
