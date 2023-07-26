package org.example.Polymorphism;

public class MethodOverloading {

    public void add(int a, int b){
        System.out.println(a+b);
    }

    public void add(double i, double j){
        System.out.println(i+j);
    }

    public void add(int x, int y, int z){
        System.out.println(x+y+z);
    }

    public static void main(String[] args) {

        MethodOverloading sum = new MethodOverloading();

        sum.add(5,6);
        sum.add(8.99,9.88);
        sum.add(1,2,3);
    }
}
