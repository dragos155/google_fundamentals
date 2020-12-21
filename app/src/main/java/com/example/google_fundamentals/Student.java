package com.example.google_fundamentals;

public class Student {
    private final String name;
    private final String prename;


    public Student(String name, String prename) {
        this.name = name;
        this.prename = prename;
    }

    public String getName() {
        return name;
    }

    public String getPrename() {
        return prename;
    }
}
