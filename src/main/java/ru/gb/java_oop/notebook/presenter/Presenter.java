package ru.gb.java_oop.notebook.presenter;

import ru.gb.java_oop.notebook.model.note.Note;
import ru.gb.java_oop.notebook.model.service.NotebookService;
import ru.gb.java_oop.notebook.view.View;

import java.time.LocalDate;
import java.time.LocalTime;

public class Presenter{
    private View view;
    private final NotebookService<Note> service;

    public Presenter(NotebookService<Note> model) {
        this.service = model;
    }

    public String addNote(LocalDate date, LocalTime time, String text) {
        Note note = new Note(date, time, text);
        return service.addItem(note);
    }

    public String showAllNotes() {
        return service.toString();
    }

    public String showDayNotes(LocalDate date) {
        return service.showDayNotes(date);
    }

    public String showNote(LocalDate date, LocalTime time) {
        return service.showNote(date, time);
    }

    public String searchText(String text) {
        return service.searchText(text);
    }

    public void sortByTime() {
        service.sortByTime();
    }

    public void deleteNote(LocalDate date, LocalTime time) {
        service.deleteNote(date, time);
    }

    public void saveNotebook() {
        service.saveNotebook();
    }

    public void restoreNotebook() {
        service.restoreNotebook();
    }

    public void create() {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.parse("09:30");
        String text = "Запись к врачу.";
        Note note = new Note(date, time, text);
        service.addItem(note);
        time = LocalTime.parse("11:50");
        text = "Текст 1.";
        note = new Note(date, time, text);
        service.addItem(note);
        time = LocalTime.parse("12:00");
        text = "Текст 2.";
        note = new Note(date, time, text);
        service.addItem(note);
        time = LocalTime.parse("12:10");
        text = "Текст 3.";
        note = new Note(date, time, text);
        service.addItem(note);
        time = LocalTime.parse("18:00");
        text = "Текст 4.";
        note = new Note(date, time, text);
        service.addItem(note);
        time = LocalTime.parse("23:50");
        text = "Текст 5.";
        note = new Note(date, time, text);
        service.addItem(note);
        for (int i = 1; i <= 10; i++) {
            date = LocalDate.now().plusDays(i);
            time = LocalTime.parse("00:00");
            text = "Текст 1.";
            note = new Note(date, time, text);
            service.addItem(note);
            date = LocalDate.now().plusDays(i);
            time = LocalTime.parse("00:10");
            text = "Текст 2.";
            note = new Note(date, time, text);
            service.addItem(note);
            time = LocalTime.parse("06:00");
            text = "Текст 3.";
            note = new Note(date, time, text);
            service.addItem(note);
            time = LocalTime.parse("11:50");
            text = "Текст 4.";
            note = new Note(date, time, text);
            service.addItem(note);
            time = LocalTime.parse("12:00");
            text = "Текст 5.";
            note = new Note(date, time, text);
            service.addItem(note);
            time = LocalTime.parse("12:10");
            text = "Текст 6.";
            note = new Note(date, time, text);
            service.addItem(note);
            time = LocalTime.parse("18:00");
            text = "Текст 7.";
            note = new Note(date, time, text);
            service.addItem(note);
            time = LocalTime.parse("23:50");
            text = "Текст 8.";
            note = new Note(date, time, text);
            service.addItem(note);
        }
        date = LocalDate.now().plusDays(2);
        time = LocalTime.parse("17:00");
        text = "Добавлена запись на 17:00.";
        note = new Note(date, time, text);
        service.addItem(note);
        time = LocalTime.parse("11:00");
        text = "Добавлена запись на 11:00.";
        note = new Note(date, time, text);
        service.addItem(note);
        date = LocalDate.now().plusDays(3);
        time = LocalTime.parse("14:00");
        text = "Добавлена запись на 14:00.";
        note = new Note(date, time, text);
        service.addItem(note);
    }
}
