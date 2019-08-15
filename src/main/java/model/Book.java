package model;

import javax.persistence.*;

@Entity
@Table(name = "books")

public class Book {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "book_title")
    private String book_title;

    @Column(name = "book_autor")
    private String book_author;

    @Column(name = "book_price")
    private Integer price;

    public int getId() {
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getBook_title() {
        return book_title;
    }

    public void setBook_title(String book_title){
        this.book_title = book_title;
    }

    public String getBook_author(){
        return book_author;
    }

    public void setBook_author(String book_author){
        this.book_author = book_author;
    }

    public Integer getPrice(){
        return  price;
    }

    public void setPrice(Integer price){
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{id=" + id + '}';
    }
}
