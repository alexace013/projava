package tasks.task001.hello;

import static java.lang.System.out;

import exceptions.IncorrectUserAgeException;
import lombok.extern.log4j.Log4j;
import entities.user.User;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Create a HelloApp class
 * that will ask User name and age
 * and then welcome them using the command line.
 * */

@Log4j
public class HelloApp {
    private static BufferedReader reader;
    private static User user;

    public static void main(String[] args) {
        out.print("Input your 'Name' press 'Enter' key and then input your 'Age':\n");
        reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            user = new User(reader.readLine(), Integer.parseInt(reader.readLine()));
        } catch (IOException | IncorrectUserAgeException e) {
            log.error(e);
        }
        String saluteUserText = HelloAction.getSaluteUserText(user);
        log.debug(saluteUserText);
        out.println(saluteUserText);
    }
}