package com.java.prototype;


public class TestClass {
    public static void main(String[] args) throws Exception {
//        BookShop prototype = BookShopPrototype.getBookShop();
//
//        System.out.println(prototype);
//        prototype.setShopName("India Books");
//        BookShop prototype1 = BookShopPrototype.getBookShop();
//        System.out.println();

        BookShop shop1=new BookShop();
      BookShop shop=  shop1.clone();
      shop.getBookList().add(new Book("aaa",3));
        System.out.println(shop);

        BookShop shop2=new BookShop();
        BookShop shop21=  shop2.clone();
        shop21.remove(1);
        System.out.println(shop21);

    }
}
