package ru.gb.java_oop.notebook.view.command;

import ru.gb.java_oop.notebook.view.ConsoleUI;

public class StopCommand extends Command{
    public StopCommand(ConsoleUI consoleUI) {
        super("Выход.", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().stop();
    }
}
