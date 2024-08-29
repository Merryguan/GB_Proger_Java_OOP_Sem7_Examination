package ru.gb.java_oop.notebook.view;

import ru.gb.java_oop.notebook.presenter.Presenter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;

public class ConsoleUI implements View {
    private final Presenter presenter;
    private final Scanner scanner;
    private final MainMenu mainMenu;
    private boolean work;

    public ConsoleUI(Presenter presenter) {
        this.presenter = presenter;
        scanner = new Scanner(System.in);
        mainMenu = new MainMenu(this);
        work = true;
    }

    @Override
    public void start() {
        int menuPoint;
        while (work) {
            System.out.println(mainMenu.menu());
            menuPoint = scanner.nextInt();
            mainMenu.execute(menuPoint);
        }
    }

    @Override
    public void printResult(String result) {
        System.out.println(result);
    }

    public void showAllNotes() {
       printResult(presenter.showAllNotes());
    }

    public void showNote() {
        System.out.println("Введите дату:");
        LocalDate date = LocalDate.parse(scanner.next());
        System.out.println(date);
        System.out.println("Введите время:");
        LocalTime time = LocalTime.parse(scanner.next());
        System.out.println(time);
        printResult(presenter.showNote(date, time));
    }

    public void showDayNotes() {
        System.out.println("Введите дату:");
        LocalDate date = LocalDate.parse(scanner.next());
        System.out.println(date);
        //LocalDate date = LocalDate.now().plusDays(2);
        System.out.println("Записи за " + date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)) + ":");
        printResult(presenter.showDayNotes(date));
    }

    public void showWeekNotes() {
        System.out.println("Введите дату:");
        LocalDate date = LocalDate.parse(scanner.next());
        //System.out.println(LocalDate.now().plusDays(2));
        System.out.println("Записи за неделю с " +
                date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)) +
                " по " +
                date.plusDays(7).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)) +
                ":");
        for (int i = 0; i < 7; i++) {
            LocalDate tmp = date.plusDays(i);
            System.out.println("Записи за " + tmp.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)) + ":");
            printResult(presenter.showDayNotes(tmp));
        }
    }

    public void searchText() {
        System.out.println("Введите текст:");
        scanner.nextLine();
        String text = scanner.nextLine();
        System.out.println(text);
        System.out.println("Записи содержащие \"" + text + "\":");
        printResult(presenter.searchText(text));
    }

    public void sortByTime() {
        presenter.sortByTime();
    }

    public void addNote() {
        System.out.println("Введите дату:");
        LocalDate date = LocalDate.parse(scanner.next());
        System.out.println(date);
        System.out.println("Введите время:");
        LocalTime time = LocalTime.parse(scanner.next());
        System.out.println(time);
        System.out.println("Введеите текст заметки");
        scanner.nextLine();
        String text = scanner.nextLine();
        System.out.println(text);
        System.out.println("Следующая заметка была добавлена:");
        System.out.println(presenter.addNote(date, time, text));
    }

    public void deleteNote() {
        System.out.println("Введите дату:");
        LocalDate date = LocalDate.parse(scanner.next());
        System.out.println(date);
        System.out.println("Введите время:");
        LocalTime time = LocalTime.parse(scanner.next());
        System.out.println(time);
        presenter.deleteNote(date, time);
    }

    public void saveNotebook() {
        presenter.saveNotebook();
        System.out.println("Записная книжка сохранена в файл.");
    }

    public void restoreNotebook() {
        presenter.restoreNotebook();
        System.out.println("Семейное древо востановленно из файла.");
    }

    public void create() {
        presenter.create();
    }

    public void stop() {
        work = false;
    }
}
