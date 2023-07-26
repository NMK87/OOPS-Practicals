package org.example.Constructors;

public class Constructors {

    private String name;
//    private int a,b;
//    Constructors(){
//        System.out.println("Constructor is called");
//        name = "neha";
//    }
    Constructors(int a , int b){
//        a= 6;b=8;
        System.out.println(a*b);

    }

    public static void main(String[] args) {

        Constructors create  = new Constructors(3,4);
//        System.out.println("the name is: "+create.name);
//        System.out.println(create.a+" "+create.b);
    }
}
