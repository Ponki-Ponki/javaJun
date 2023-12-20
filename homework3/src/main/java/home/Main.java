package home;

import java.io.*;

/**
 * Разработайте класс Student с полями String name, int age, transient double GPA
 * (средний балл). Обеспечьте поддержку сериализации для этого класса.
 * Создайте объект класса Student и инициализируйте его данными.
 * Сериализуйте этот объект в файл. Десериализуйте объект обратно в программу из файла.
 * Выведите все поля объекта, включая GPA, и обсудите, почему значение GPA не
 * было сохранено/восстановлено.
 * 2. * Выполнить задачу 1 используя другие типы сериализаторов (в xml и json документы).
 */


public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student = new Student();
        desInput("test",student);

        Student student1 = desOutput("test");
        System.out.println(student1.toString());
    }

    public static void desInput(String file, Student student) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(student);
        objectOutputStream.close();
        System.out.println("Объект UserData сериализован.");
    }

    public static Student desOutput(String file) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Student student = (Student) objectInputStream.readObject();
        System.out.println("Объект UserData десериализован.");
        objectInputStream.close();
        return student;
    }

    
}