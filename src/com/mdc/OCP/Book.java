package com.mdc.OCP;

/**
 * Created by CaDyMaN on 28.01.2017.
 */
class Book {
    int id;
    String name;

    public Book(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public boolean equals(Object obj) {
        //line n1
        boolean output = false;
        Book b = (Book) obj;
        if (this.name.equals(b.name)) {
            output = true;
        }
        return output;
    }
}