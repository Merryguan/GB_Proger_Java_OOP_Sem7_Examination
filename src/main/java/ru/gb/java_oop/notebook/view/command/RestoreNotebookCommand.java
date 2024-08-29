package ru.gb.java_oop.notebook.view.command;

import ru.gb.java_oop.notebook.view.ConsoleUI;

public class RestoreNotebookCommand extends Command {
    public RestoreNotebookCommand(ConsoleUI consoleUI) {
        super("Загрузить записную книжку из файла.", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().restoreNotebook();
    }
}
