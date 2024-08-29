package ru.gb.java_oop.notebook.model.writer;

import ru.gb.java_oop.notebook.model.notebook.Notebook;
import ru.gb.java_oop.notebook.model.notebook.NotebookItem;

import java.io.*;

public class FileHandler<T extends NotebookItem<T>> implements Writer<T> {
    public void saveToFile(Notebook<T> notebook, String string) {
        FileOutputStream output = null;
        ObjectOutputStream objectOutputStream;
        try {
            output = new FileOutputStream(string);
        } catch (IOException e) {
            System.out.println("Файл не найден.");
        }
        try {
            objectOutputStream = new ObjectOutputStream(output);
            objectOutputStream.writeObject(notebook);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Notebook<T> restoreFromFile (String string) {
        FileInputStream input = null;
        ObjectInputStream objectInputStream;
        Notebook<T> result = new Notebook<>();
        try {
            input = new FileInputStream(string);
        } catch (IOException e) {
            System.out.println("Файл не найден.");
        }
        try {
            objectInputStream = new ObjectInputStream(input);
            result = (Notebook<T>) objectInputStream.readObject();
            objectInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
