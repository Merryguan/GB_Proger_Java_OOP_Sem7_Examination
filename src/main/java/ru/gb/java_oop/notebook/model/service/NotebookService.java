package ru.gb.java_oop.notebook.model.service;

import ru.gb.java_oop.notebook.model.notebook.Notebook;
import ru.gb.java_oop.notebook.model.notebook.NotebookItem;
import ru.gb.java_oop.notebook.model.writer.FileHandler;

import java.time.LocalDate;
import java.time.LocalTime;

public class NotebookService<T extends NotebookItem<T>> {
    private Notebook<T> notebook;
    private int itemId;
    FileHandler<T> fileHandler;

    public NotebookService() {
        this.notebook = new Notebook<>();
        this.itemId = 0;
        this.fileHandler = new FileHandler<>();
    }

    public Notebook<T> getNotebook() {
        return notebook;
    }

    public void setNotebook(Notebook<T> notebook) {
        this.notebook = notebook;
    }

    @Override
    public String toString() {
        return notebook.toString();
    }

    public String addItem(T item) {
        item.setId(++itemId);
        notebook.addNote(item);
        return item.toString();
    }

    public String showDayNotes(LocalDate date) {
        return notebook.ShowDayNotes(date);
    }

    public String showNote(LocalDate date, LocalTime time) {
        return notebook.searchNote(date, time).toString();

    }

    public void deleteNote(LocalDate date, LocalTime time) {
        int id = notebook.searchNote(date, time).getId();
        notebook.deleteNote(id-1);
        itemId--;
    }

    public String searchText(String text) {
        return notebook.searchText(text);
    }

    public void sortByTime() {
        notebook.sortByTime();
    }

    public void saveNotebook() {
        fileHandler.saveToFile(notebook,"Notebook.txt");
    }

    public void restoreNotebook() {
        notebook = fileHandler.restoreFromFile("Notebook.txt");
    }
}
