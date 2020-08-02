package com.java.prototype;

public class BookBuilder {
    String bookName;
    int bookId;

    public BookBuilder() {
    }

    public BookBuilder setBookName(String bookName) {
        this.bookName = bookName;
        return this;
    }

    public BookBuilder setBookId(int bookId) {
        this.bookId = bookId;
        return this;
    }
    public Book build(){
        Book book =new Book();
        book.setBookName(this.bookName);
        book.setBookId(this.bookId);
        return book;
    }

    @Override
    public String toString() {
        return "BookBuilder{" +
                "bookName='" + bookName + '\'' +
                ", bookId=" + bookId +
                '}';
    }
}
