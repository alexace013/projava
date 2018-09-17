package tasks.task004;

import tasks.task004.logic.LogicActions;

/*
* Создать приложение для ввода пароля из командной строки
* и сравнения его со строкой-образцом
* */
public class MainApp {
    public static void main(String [] args) {
        System.out.print(LogicActions.inputPassword(1234));
    }
}