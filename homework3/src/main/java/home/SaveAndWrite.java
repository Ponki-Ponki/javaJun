package home;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.*;
public class SaveAndWrite {
    public static final String FILE_JSON = "test.json";
    public static final String FILE_BIN = "test.bin";
    public static final String FILE_XML = "test.xml";

    private static final ObjectMapper objectMapper = new ObjectMapper();
    private static final XmlMapper xmlMapper = new XmlMapper();

    public SaveAndWrite() {
    }


    public static void saveTasksToFile(String fileName, Student student) {
        try {
            if (fileName.endsWith(".json")) {
                objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);
                objectMapper.writeValue(new File(fileName), student);
            } else if (fileName.endsWith(".bin")) {
                try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
                    oos.writeObject(student);
                }
            } else if (fileName.endsWith(".xml")) {

                xmlMapper.writeValue(new File(fileName), student);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Student loadTasksFromFile(String fileName) {
        Student student = null;

        File file = new File(fileName);
        if (file.exists()) {
            try {
                if (fileName.endsWith(".json")) {
                    student = objectMapper.readValue(file, objectMapper.getTypeFactory().constructType(Student.class));
                } else if (fileName.endsWith(".bin")) {
                    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                        student = (Student) ois.readObject();
                    }
                } else if (fileName.endsWith(".xml")) {
                    student = xmlMapper.readValue(file, xmlMapper.getTypeFactory().constructType(Student.class));
                }
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

        return student;
    }
}
