package com.java.prototype;

public class BookShopPrototype {

    private static final BookShop INSTANCE = new BookShop();
//    static {
//        INSTANCE.setShopName("Printing Hall India");

//        Book b = new Book();
//        b.setBookId(10);
//
//        INSTANCE.addBook(b);
//        INSTANCE.setBook(b);
   // }

    public static BookShop getBookShop() throws CloneNotSupportedException
    {
        return (BookShop) INSTANCE.clone();
    }
}
