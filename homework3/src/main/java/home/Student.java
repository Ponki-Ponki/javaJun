package home;

import java.io.Serializable;

public class Student implements Serializable {
    String name;
    int age;
    transient double GPA; // transient защита от сериализации

    public Student() {
        this.name = "name";
        this.age = 10;
        this.GPA = 10.0;
    }

    public Student(String name, int age, double GPA) {
        this.name = name;
        this.age = age;
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", GPA=" + GPA +
                '}';
    }
}
