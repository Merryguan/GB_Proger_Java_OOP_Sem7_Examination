package ru.gb.java_oop.notebook.view.command;

import ru.gb.java_oop.notebook.view.ConsoleUI;

public class AddNoteCommand extends Command {
    public AddNoteCommand(ConsoleUI consoleUI) {
        super("Добавить запись.", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().addNote();
    }
}
