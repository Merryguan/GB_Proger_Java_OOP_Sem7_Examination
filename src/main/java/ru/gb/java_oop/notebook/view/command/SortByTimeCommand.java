package ru.gb.java_oop.notebook.view.command;

import ru.gb.java_oop.notebook.view.ConsoleUI;

public class SortByTimeCommand extends Command {
    public SortByTimeCommand(ConsoleUI consoleUI) {
        super("Сортировать по времени.", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().sortByTime();
    }
}
