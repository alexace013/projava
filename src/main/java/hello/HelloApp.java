package hello;

import static java.lang.System.out;

import lombok.extern.log4j.Log4j;
import user.User;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Create a HelloApp class that will welcome any User using the command line.
 * */

@Log4j
public class HelloApp {

    private static BufferedReader reader;
    private static User user;

    public static void main(String[] args) {
        out.print("input name: ");
        reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            user = new User(reader.readLine());
        } catch (IOException e) {
            log.error(e);
        }
        String saluteUserText = HelloAction.getSaluteUserText(user);
        log.debug(saluteUserText);
        out.println(saluteUserText);
    }
}
