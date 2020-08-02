package com.java.prototype;

public class Book1 implements Cloneable{
    int id;
    String name;

    public Book1() {
    }

    public Book1(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public Book1 add(Book1 book1){
        return book1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Book1 clone() throws CloneNotSupportedException {
        Book1 book1=new Book1(1,"abc");
      Book1 book11=  book1.add(book1);
        return book1;
    }

    @Override
    public String toString() {
        return "Book1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
