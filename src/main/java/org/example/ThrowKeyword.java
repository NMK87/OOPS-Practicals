package org.example;

public class ThrowKeyword {

    public static void validate (int age){
       try{
        if(age>18){
            throw new ArithmeticException("Person is eligible to vote");

        }}
       catch(Exception e){
           System.out.println(e);
        }
    }

    public static void main(String[] args) {
        validate(8);
    }
}
