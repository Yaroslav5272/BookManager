package service;

import DAO.BookDAO;
import model.Book;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    private BookDAO bookDAO;

    public void setBookDAO(BookDAO bookDAO){
        this.bookDAO = bookDAO;
    }

    @Override
    @Transactional
    public void addBook(Book book) {
        bookDAO.addBook(book);
    }

    @Override
    @Transactional
    public void updateBook(Book book) {
        bookDAO.appdateBook(book);
    }

    @Override
    @Transactional
    public void removeBook(Integer id) {
        bookDAO.removeBook(id);
    }

    @Override
    @Transactional
    public Book getBookById(Integer id) {
        Book book = bookDAO.getBookById(id);
        return book;
    }

    @Override
    @Transactional
    public List<Book> listBooks() {
        return bookDAO.listBook();
    }
}