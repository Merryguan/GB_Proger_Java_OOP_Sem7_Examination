package ru.gb.java_oop.notebook.model.notebook;

import ru.gb.java_oop.notebook.model.service.ComparatorByTime;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Notebook<T extends NotebookItem<T>> implements Serializable {
    private final List<T> notebook;

    public Notebook() {
        this.notebook = new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (T item : notebook) {
            result.append(item).append("\n");
        }
        return result.toString();
    }

    public void addNote(T item) {
        notebook.add(item);
    }

    public void deleteNote(int id) {
        notebook.remove(id);
    }

    public String ShowDayNotes(LocalDate date) {
        StringBuilder result = new StringBuilder();
        List<T> tmp = new ArrayList<>();
        for (T item : notebook) {
            if (item.getDate().equals(date)) {
                tmp.add(item);
            }
        }
        tmp.sort(new ComparatorByTime<>());
        for (T item : tmp) {
                result.append(item).append("\n");
        }
        return result.toString();
    }

    public T searchNote(LocalDate date, LocalTime time) {
        for (T item : notebook) {
            if (item.getDate().equals(date) && item.getTime().equals(time)) {
                return item;
            }
        }
        return null;
    }

    public String searchText(String text) {
        StringBuilder result = new StringBuilder();
        for (T item : notebook) {
            if (item.getNote().toLowerCase().contains(text.toLowerCase())) {
                result.append(item).append("\n");
            }
        }
        return result.toString();
    }

    public void sortByTime() {
        notebook.sort(new ComparatorByTime<>());
    }
}
