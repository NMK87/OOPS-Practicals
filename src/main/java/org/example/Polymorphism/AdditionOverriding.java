package org.example.Polymorphism;

public class AdditionOverriding {

    void add(int a, int b){
        System.out.println(a+b);
    }
}

class Adding extends AdditionOverriding{
    void add(int a, int b){
        System.out.println(a+" "+b);
    }
}

class Sum extends AdditionOverriding{
    void add(int a, int b){
        System.out.println(a);
    }
}