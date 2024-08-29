package ru.gb.java_oop.notebook.model.note;

import ru.gb.java_oop.notebook.model.notebook.NotebookItem;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Note implements NotebookItem<Note> {
    private int id = -1;
    private LocalDate date;
    private LocalTime time;
    private String note;

    public Note(LocalDate date, LocalTime time, String note) {
        this.date = date;
        this.time = time;
        this.note = note;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    @Override
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)))
                .append(" ").append(time.format(DateTimeFormatter.ofPattern("HH:mm")))
                .append(": ").append(note);
        return result.toString();
    }

    /*
    @Override
    public int compareTo(Note o) {
        return note.compareTo(o.note);
    }

     */
}
