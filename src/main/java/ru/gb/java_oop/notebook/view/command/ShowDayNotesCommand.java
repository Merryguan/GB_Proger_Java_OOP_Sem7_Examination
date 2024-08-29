package ru.gb.java_oop.notebook.view.command;

import ru.gb.java_oop.notebook.view.ConsoleUI;

public class ShowDayNotesCommand extends Command {
    public ShowDayNotesCommand(ConsoleUI consoleUI) {
        super("Вывести записи за день.", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().showDayNotes();
    }
}
