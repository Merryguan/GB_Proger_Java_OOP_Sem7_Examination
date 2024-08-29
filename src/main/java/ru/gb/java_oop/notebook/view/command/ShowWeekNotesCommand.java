package ru.gb.java_oop.notebook.view.command;

import ru.gb.java_oop.notebook.view.ConsoleUI;

public class ShowWeekNotesCommand extends Command {
    public ShowWeekNotesCommand(ConsoleUI consoleUI) {
        super("Вывести записи за неделю.", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().showWeekNotes();
    }
}
