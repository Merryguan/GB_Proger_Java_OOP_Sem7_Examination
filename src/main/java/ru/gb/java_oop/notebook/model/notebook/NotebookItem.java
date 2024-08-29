package ru.gb.java_oop.notebook.model.notebook;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

public interface NotebookItem<T> extends Serializable {
    int getId();
    void setId(int id);
    LocalDate getDate();
    LocalTime getTime();
    String getNote();
}
