package ru.gb.java_oop.notebook.model.notebook;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

public interface NotebookItem<T> extends Serializable {
    public int getId();
    public void setId(int id);
    public LocalDate getDate();
    public LocalTime getTime();
    public String getNote();
}
