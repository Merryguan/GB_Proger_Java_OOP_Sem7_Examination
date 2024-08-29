package ru.gb.java_oop.notebook.view;

import ru.gb.java_oop.notebook.view.command.*;

import java.util.ArrayList;
import java.util.List;

public class MainMenu {
    private final List<Command> commands;

    public MainMenu(ConsoleUI consoleUI) {
        commands = new ArrayList<>();
        commands.add(new ShowAllNotesCommand(consoleUI));
        commands.add(new ShowWeekNotesCommand(consoleUI));
        commands.add(new ShowDayNotesCommand(consoleUI));
        commands.add(new DeviderCommand(consoleUI));
        commands.add(new ShowNoteCommand(consoleUI));
        commands.add(new SearchTextCommand(consoleUI));
        //commands.add(new SortByTimeCommand(consoleUI));
        commands.add(new DeviderCommand(consoleUI));
        commands.add(new CreateCommand(consoleUI));
        commands.add(new AddNoteCommand(consoleUI));
        commands.add(new DeleteNoteCommand(consoleUI));
        commands.add(new DeviderCommand(consoleUI));
        commands.add(new SaveNotebookCommand(consoleUI));
        commands.add(new RestoreNotebookCommand(consoleUI));
        commands.add(new DeviderCommand(consoleUI));
        commands.add(new StopCommand(consoleUI));
    }

    public String menu() {
        StringBuilder result = new StringBuilder();
        result.append("Меню:\n");
        for (int i = 0; i < commands.size(); i++) {
            if (i != 3 && i != 6 && i != 10 && i != 13) {
                result.append(i + 1)
                        .append(". ");
            }
            result.append(commands.get(i).getDescription())
                    .append("\n");
        }
        result.append("\n").append("Выберите пункт меню: ");
        return result.toString();
    }

    public void execute(int choice) {
        Command command = commands.get(choice - 1);
        command.execute();
    }

    public int size() {
        return commands.size();
    }

}
