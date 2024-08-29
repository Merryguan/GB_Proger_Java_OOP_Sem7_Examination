package ru.gb.java_oop.notebook.view.command;

import ru.gb.java_oop.notebook.view.ConsoleUI;

public class ShowAllNotesCommand extends Command {
    public ShowAllNotesCommand(ConsoleUI consoleUI) {
        super("Вывести все записи.", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().showAllNotes();
    }
}
