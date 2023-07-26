package org.example.ExceptionHandling;

public class ExceptionHandling {

    public static void main(String[] args) {

        try {
            int a = 100 / 0;
        }
        catch (Exception e){
            System.out.println("Error"+e);
        }
        finally{
            System.out.println("Exception is handled");
        }


    }

}
