package com.example.javabyte.serialization;

import java.beans.Transient;
import java.io.Serializable;

public class Student implements Serializable {

    private static final long serialVersionUID = 2L;
    private int id;
    private String name;
    private transient String lastname;

    public Student(int id, String name, String lastname){
        this.id = id;
        this.name = name;
        this.lastname = lastname;
    }

    @Override
    public String toString(){
        return "ID: "  + id + " Name: " + name + " Lastname: " + lastname;
    }
}
