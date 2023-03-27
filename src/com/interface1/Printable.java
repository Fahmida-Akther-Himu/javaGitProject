package com.interface1;

public interface Printable {
    int oneSide = 10;
    void print();

    default void make(){
        showPicture();
        System.out.println("Please make a square.");
    }
    public static int showArea(int oneSide){
        oneSide = 11;
        seeSquare(10);
        return oneSide*oneSide;
    }
    private void showPicture(){
        System.out.println("Private Method");

    }
    private static int seeSquare(int length){
        System.out.println(showArea(5));
        return length;
    }

}
