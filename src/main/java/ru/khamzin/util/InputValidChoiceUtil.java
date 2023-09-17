package ru.khamzin.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputValidChoiceUtil {

    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static int readValidChoice(int min, int max) {
        while (true) {
            try {
                int choice = Integer.parseInt(reader.readLine());
                if (choice >= min && choice <= max) {
                    return choice;
                }
                handleInputException(String.format("Некорректное значение. Значение должно быть от %d до %d", min, max));
            } catch (IOException | NumberFormatException e) {
                handleInputException(String.format("Некорректное значение. Нужно ввести целочисленное значение от %d до %d", min, max));
            }
        }
    }

    private static void handleInputException(String errorMessage) {
        System.err.println(errorMessage);
        System.err.print("Попробуйте снова: ");
    }
}
