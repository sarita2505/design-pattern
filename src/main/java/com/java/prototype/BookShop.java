package com.java.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {

    private List<Book> bookList;
    private String shopName;
    private Book book;

    public BookShop() {
    }

    public List<Book> getBookList() {
        if (this.bookList == null) {
            this.bookList = new ArrayList<>();
        }
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public void addBook(Book book)
    {
        getBookList().add(book);
    }
    public void remove(int id)
    {
        getBookList().remove(id);
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    protected BookShop clone() throws CloneNotSupportedException {
        //here set all the data that u want to make constant for all
       // BookShop clonedBookShop = (BookShop) super.clone();
        // set refrence types, List, Book
        BookShop clonedBookShop=new BookShop();
        List list=new ArrayList();
        list.add(new Book("xyz",1));
        list.add(new Book("abc",2));
        //create book onj witgh hardcoded parameter and add it in the list
        clonedBookShop.setBookList(list);
        return clonedBookShop;
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "booksList=" + bookList +
                ", shopName='" + shopName + '\'' +
                '}';
    }
}
