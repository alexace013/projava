package tasks.task005;

import tasks.task005.logic.ActionsApp;

/*
* Создать программу ввода целых чисел как аргументов командной строки,
* подсчета их суммы (произведения) вывода результата на консоль
* */
public class MainApp {
    public static void main(String [] args) {
        System.out.println("Factum of numbers: " + ActionsApp.getSum());
    }
}