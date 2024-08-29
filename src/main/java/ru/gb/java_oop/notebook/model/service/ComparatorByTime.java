package ru.gb.java_oop.notebook.model.service;

import ru.gb.java_oop.notebook.model.notebook.NotebookItem;

import java.util.Comparator;

public class ComparatorByTime<T extends NotebookItem<T>> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return o1.getTime().compareTo(o2.getTime());
        //return Integer.compare(o1.getAge(), o2.getAge());
    }
}
