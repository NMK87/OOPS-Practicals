package org.example.Ecapsulation;

public class LibraryEncapMain extends LibraryEncap {
    public static void main(String[] args) {

        LibraryEncap encap = new LibraryEncap();

        encap.setName("The Alchemist");
        encap.setAuthor("Palno");
        encap.setBook_id(1);
        encap.setRating(5);

        System.out.println("The book name is: "+encap.getName()+" "+", the author is"+encap.getAuthor()+" "+" with book id"+encap.getBook_id()+" "+"and its rating is: "+encap.getRating());

    }
}
