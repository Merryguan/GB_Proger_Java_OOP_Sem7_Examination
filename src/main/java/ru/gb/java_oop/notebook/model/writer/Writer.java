package ru.gb.java_oop.notebook.model.writer;

import ru.gb.java_oop.notebook.model.notebook.Notebook;
import ru.gb.java_oop.notebook.model.notebook.NotebookItem;

public interface Writer<T extends NotebookItem<T>> {
    void saveToFile(Notebook<T> notebook, String string);
    Notebook<T> restoreFromFile (String string);
}
