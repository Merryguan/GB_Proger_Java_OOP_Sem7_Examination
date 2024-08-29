package ru.gb.java_oop.notebook.view.command;

import ru.gb.java_oop.notebook.view.ConsoleUI;

public class DeviderCommand extends Command{
    public DeviderCommand(ConsoleUI consoleUI) {
        super("--------------------------------------------------------------------------------------", consoleUI);
    }

    @Override
    public void execute() {
    }
}
