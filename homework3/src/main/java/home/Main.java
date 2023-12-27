package home;

public class Main {
    public static void main(String[] args){
        Student student = new Student();


        SaveAndWrite.saveTasksToFile(SaveAndWrite.FILE_JSON,student);
        SaveAndWrite.saveTasksToFile(SaveAndWrite.FILE_XML,student);
        SaveAndWrite.saveTasksToFile(SaveAndWrite.FILE_BIN,student);


        Student student1 = SaveAndWrite.loadTasksFromFile(SaveAndWrite.FILE_JSON);
        System.out.println(student1.toString());
        Student student2 = SaveAndWrite.loadTasksFromFile(SaveAndWrite.FILE_XML);
        System.out.println(student2.toString());
        Student student3 = SaveAndWrite.loadTasksFromFile(SaveAndWrite.FILE_BIN);
        System.out.println(student3.toString());

    }

}