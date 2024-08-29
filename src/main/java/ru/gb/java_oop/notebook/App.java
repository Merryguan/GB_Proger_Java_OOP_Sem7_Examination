package ru.gb.java_oop.notebook;

import ru.gb.java_oop.notebook.model.note.Note;
import ru.gb.java_oop.notebook.model.service.NotebookService;
import ru.gb.java_oop.notebook.presenter.Presenter;
import ru.gb.java_oop.notebook.view.ConsoleUI;
import ru.gb.java_oop.notebook.view.View;

public class App {
    private final View view;
    private final Presenter presenter;
    private final NotebookService<Note> model;

    public App() {
        model = new NotebookService<>();
        presenter = new Presenter(model);
        view = new ConsoleUI(presenter);
    }

    public View getView() {
        return view;
    }
}
