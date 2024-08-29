package ru.gb.java_oop.notebook.view.command;

import ru.gb.java_oop.notebook.view.ConsoleUI;

public class CreateCommand extends Command {
    public CreateCommand(ConsoleUI consoleUI) {
        super("Заполнить записную книжку.", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().create();
    }
}
