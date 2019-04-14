package userProject.utils;

import com.github.javafaker.Faker;

public class JavaFakerGenerator {
    private static Faker faker = new Faker();

    public static String generateFirstName() {
        return faker.name().firstName();
    }

    public static String generateSecondName() {
        return faker.name().lastName();
    }

    public static Long generateNumber(int countOfDigits) {
        return faker.number().randomNumber(countOfDigits, true);
    }
}