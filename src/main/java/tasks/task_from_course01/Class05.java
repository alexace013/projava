package tasks.task_from_course01;

import java.util.Scanner;

/*
 * Четверть
 * Пользователь вводит координаты точки,
 * определить в какой она находится четверти (декартова система координат),
 * углы наз. - координатными углами, четвертями или квадрантами плоскости.
 * Если точка находится между четвертями, то выводить 0
 * Пример:
 * -2 2
 * 2
 * */
public class Class05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите координаты (от -10 до 10 (включительно)) для оси 'x': ");
        byte x = scanner.nextByte();

        System.out.print("Введите координаты (от -10 до 10 (включительно)) для оси 'y': ");
        byte y = scanner.nextByte();

        System.out.println("- - - - -");
        if ((x > 0 & x < 11) & (y > 0 & y < 11)) {
            System.out.println("Координаты расположены в первой четверти (в правом верхнем углу)");
        } else if ((x < 0 & x > -11) & (y > 0 & y < 11)) {
            System.out.println("Координаты расположены во второй четверти (в левом верхнем углу)");
        } else if ((x < 0 & x > -11) & (y < 0 & y > -11)) {
            System.out.println("Координаты расположены в третей четверти (в левом нижнем углу)");
        } else if ((x > 0 & x < 11) & (y < 0 & y > -11)) {
            System.out.println("Координаты расположены в четвертой четверти (в правом нижнем углу)");
        } else if (x == 0 & y == 0) {
            System.out.println("Координатов нет!");
        } else {
            System.out.println("Быдыыыщь!");
        }

        System.out.println("- - - - -");
        System.out.print("Ваши координаты:\nx = " + x + "\n" + "y = " + y + "\n");
    }
}