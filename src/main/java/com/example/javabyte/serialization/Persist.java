package com.example.javabyte.serialization;

import java.io.*;

public class Persist {

    Student s1 = new Student(1, "Umaralikhon", "Kayumov");

    public void serializeObject() {
        try {
            FileOutputStream fout = new FileOutputStream("student.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(s1);
            out.flush();
            out.close();
            System.out.println("Success");
            System.out.println(s1.toString());
        } catch (
                IOException ex) {
            ex.printStackTrace();
        }
    }

    public void deserializeObject() {
        try {
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("student.txt"));
            Student s = (Student) input.readObject();
            System.out.println(s.toString());
            input.close();
        }catch (IOException | ClassNotFoundException ex){
            ex.printStackTrace();
        }
    }
}
