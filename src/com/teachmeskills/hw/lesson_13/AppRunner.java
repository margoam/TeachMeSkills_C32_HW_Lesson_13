package com.teachmeskills.hw.lesson_13;

import com.teachmeskills.hw.lesson_13.exception.WrongLoginException;
import com.teachmeskills.hw.lesson_13.exception.WrongPasswordException;
import com.teachmeskills.hw.lesson_13.util.CredentialsValidator;

import java.util.Scanner;

/**
 * Создать класс, в котором будет статический метод.
 * Этот метод принимает на вход три параметра:
 * 	Login
 * 	Password
 * 	confirmPassword
 * Все поля имеют тип данных String.
 * Длина login должна быть меньше 20 символов и не должен содержать
 * пробелы.
 * Если login не соответствует этим требованиям, необходимо "выбросить" WrongLoginException.
 * Длина password должна быть меньше 20 символов, не должен содержать пробелом и должен содержать хотя бы одну цифру.
 * Также password и confirmPassword должны быть равны.
 * Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
 * Классы-исключения WrongPasswordException и WrongLoginException - пользовательские
 * классы исключения с двумя конструкторами – один по умолчанию, второй
 * принимает сообщение исключения и передает его в конструктор класса Exception.
 * Метод возвращает true, если значения валидны или false в другом случае.
 * Разместить классы по пакетам: класс для проверки значений должен находится в своем отдельном пакете, классы для исключений - в своем.
 * Создать класс Runner для тестирования этого класса.
 * Попробовать решить задачу двумя способами:
 * 1. методами класса String "из коробки", например метод contains
 * 2. разбив строку на массив char'ов (string toCharArray()) и сделать обход и проверку массива
 */
public class AppRunner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter login and password");

        System.out.print("Login: ");
        String login = scanner.nextLine();

        System.out.print("Password: ");
        String password = scanner.nextLine();

        System.out.print("Confirm password: ");
        String confirmPassword = scanner.nextLine();

        //1st method check
        try {
            boolean checkResult = CredentialsValidator.credentialsCheck(login, password, confirmPassword);
            System.out.println("Creds validation successful." + "\n1st result is: "+ checkResult);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Validation failed: " + e.getMessage());
        }

        //2nd method check
        try {
            boolean checkResultSecondMethod = CredentialsValidator.credentialsCheckInArray(login, password, confirmPassword);
            System.out.println("2nd result is: "
                    + checkResultSecondMethod);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Validation failed: " + e.getMessage());
        }
    }
}
