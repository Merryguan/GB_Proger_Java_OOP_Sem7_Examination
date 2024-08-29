package ru.gb.java_oop.notebook.view.command;

import ru.gb.java_oop.notebook.view.ConsoleUI;

public class DeleteNoteCommand extends Command {
    public DeleteNoteCommand(ConsoleUI consoleUI) {
        super("Удалить запись.", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().deleteNote();
    }
}
