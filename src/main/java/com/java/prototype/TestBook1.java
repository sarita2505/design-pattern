package com.java.prototype;

public class TestBook1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Book1 book1=new Book1();


        Book1 book11=book1.clone();
        //Book1 book121=book1.add(new Book1(1,"ccc"));
        System.out.println(book11);

        Book1 book2=new Book1();
        Book1 book12=book2.clone();
        System.out.println(book12);
    }
}
