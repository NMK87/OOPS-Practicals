package org.example.Polymorphism;

public class AddByMethodOverloading {

    public void adding(int a, int b){
        System.out.println(a+b);
    }

    public void adding(double i, double j){
        System.out.println(i+" "+j);
    }

    public void adding(String firstName, String lastName){
        System.out.println(firstName+lastName);
    }

    public static void main(String[] args) {
        AddByMethodOverloading overload = new AddByMethodOverloading();

        overload.adding(2,3);
        overload.adding(9.88,8.67);
        overload.adding("Neha","P");
    }

}
