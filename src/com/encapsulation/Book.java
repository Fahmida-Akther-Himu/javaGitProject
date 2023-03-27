package com.encapsulation;

public class Book {
    private String name;
    private int width;
    private int length;

    public Book(String name, int width, int length) {
        this.name = name;
        this.width = width;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public static void main(String[] args) {
        Book readOnlyEncapsulation = new Book("Silence in the Land of Gold", 2, 5);
        System.out.println("The name of the book was : " + readOnlyEncapsulation.getName());
        System.out.println("The width of the book will be " + readOnlyEncapsulation.getWidth() + " inches.");
    }
}
