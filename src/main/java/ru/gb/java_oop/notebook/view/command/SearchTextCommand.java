package ru.gb.java_oop.notebook.view.command;

import ru.gb.java_oop.notebook.view.ConsoleUI;

public class SearchTextCommand extends Command {
    public SearchTextCommand(ConsoleUI consoleUI) {
        super("Найти записи содержащие определенную строку.", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().searchText();
    }
}
