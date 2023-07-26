package org.example;

public class InheritancePartTwo extends Inheritance{

    public String favFood = "upma";

    public static void main(String[] args) {
        InheritancePartTwo inherit = new InheritancePartTwo();

        System.out.println(inherit.favFood + " "+inherit.favFruit+" "+inherit.favVegiee);
    }
}
