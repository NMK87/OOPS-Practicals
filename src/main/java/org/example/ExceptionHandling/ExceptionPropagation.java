package org.example.ExceptionHandling;

public class ExceptionPropagation {

    void m() throws ArithmeticException{
        throw new ArithmeticException("Exception");
    }

    void n() throws ArithmeticException{
        m();
    }

    void p(){
        try{
            n();
        }
        catch(Exception e){
            System.out.println("Exception handled");
        }
    }

    public static void main(String[] args) {
        ExceptionPropagation exp = new ExceptionPropagation();
        exp.p();
        System.out.println("Smooth flow");
    }
}
