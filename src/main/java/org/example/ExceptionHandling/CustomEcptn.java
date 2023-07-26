package org.example.ExceptionHandling;


class InvalidAgeException extends Exception{
    InvalidAgeException(String msg){
        super(msg);
    }
}

public class CustomEcptn {

    public static void votingAge(int age) throws InvalidAgeException{
        if(age<18){

            throw new InvalidAgeException("not eligible");

        }

        else{
            System.out.println("eligible");
        }
    }

    public static void main(String[] args) {
        try{
            CustomEcptn.votingAge(90);
        }
        catch (InvalidAgeException e){
            System.out.println("Exception is "+e);
        }
    }
}
