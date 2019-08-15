package DAO;

import model.Book;

import java.util.List;

public interface BookDAO {

    public void addBook(Book book);
    public void appdateBook(Book book);
    public void removeBook(Integer id);
    public Book getBookById(Integer id);
    public List<Book> listBook();
}
