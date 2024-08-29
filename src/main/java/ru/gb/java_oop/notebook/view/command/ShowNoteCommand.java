package ru.gb.java_oop.notebook.view.command;

import ru.gb.java_oop.notebook.view.ConsoleUI;

public class ShowNoteCommand extends Command {
    public ShowNoteCommand(ConsoleUI consoleUI) {
        super("Найти запись на определенные дату и время.", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().showNote();
    }
}
