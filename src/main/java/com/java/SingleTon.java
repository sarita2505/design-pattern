package com.java;

public class SingleTon {
    private SingleTon() {
    }

    //private static SingleTon singleTon = new SingleTon();

    //eager initialization
//    public static SingleTon singletonObj() {
//        System.out.println("hii");
//        return singleTon;
//    }

//    public void disp() {
//        System.out.println("hello");
//    }


    //lazy loading
    private static SingleTon singleTon;
    public static  SingleTon singletonObj() {
        if (singleTon == null) {
            synchronized (SingleTon.class) {
                System.out.println("hii");
                singleTon = new SingleTon();
            }
        }
        return singleTon;
    }
    public void disp() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        SingleTon singleTon1 = singletonObj();
        SingleTon disp1 = new SingleTon();
        disp1.disp();
        System.out.println("singleTon1 " +singleTon1.hashCode());
        System.out.println("disp1 " + disp1.hashCode());
        SingleTon singleTon2 = singletonObj();
        SingleTon disp2 = new SingleTon();
        disp2.disp();
        System.out.println("singleTon1 " +singleTon2.hashCode());
        System.out.println("disp2 " + disp1.hashCode());
    }

}
