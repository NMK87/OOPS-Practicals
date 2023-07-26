package org.example.Polymorphism;

import org.example.Polymorphism.Adding;
import org.example.Polymorphism.Sum;

public class MethodOverridingEx2 extends AdditionOverriding {

    public static void main(String[] args) {

        AdditionOverriding as = new AdditionOverriding();
        as = new Adding();
        as.add(2,3);
        as = new Sum();
        as.add(4,5);

    }
}
