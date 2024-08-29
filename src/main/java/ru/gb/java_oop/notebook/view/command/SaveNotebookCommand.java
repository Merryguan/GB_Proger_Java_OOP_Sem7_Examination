package ru.gb.java_oop.notebook.view.command;

import ru.gb.java_oop.notebook.view.ConsoleUI;

public class SaveNotebookCommand extends Command {
    public SaveNotebookCommand(ConsoleUI consoleUI) {
        super("Сохранить записную книжку в файл.", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().saveNotebook();
    }
}
