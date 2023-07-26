package org.example.Ecapsulation;

public class LibraryEncap {

    private String name;

    private int book_id;

    private String Author;

    private int rating;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }
    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
