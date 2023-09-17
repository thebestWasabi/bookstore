package ru.khamzin.view;

import ru.khamzin.controller.EmployeeController;
import ru.khamzin.entity.enums.EmployeeStatus;
import ru.khamzin.util.InputValidChoiceUtil;

import java.util.Scanner;

public class EmployeeView {

    private static final int MIN_CHOICE = 1;
    private static final int MAX_CHOICE = 6;

    private final Scanner scanner;
    private final EmployeeController employeeController;

    public EmployeeView(EmployeeController employeeController) {
        this.employeeController = employeeController;
        scanner = new Scanner(System.in);
    }

    public void run() {
        int commander;
        do {
            System.out.println("\nВыберите из списка:");
            System.out.println("1. Создать работника");
            System.out.println("2. Получить работника по id");
            System.out.println("3. Получить всех работников");
            System.out.println("4. Обновить работника");
            System.out.println("5. Удалить работника");
            System.out.println("6. Назад");

            commander = InputValidChoiceUtil.readValidChoice(MIN_CHOICE, MAX_CHOICE);
            switch (commander) {
                case 1 -> createEmployee();
                case 2 -> getEmployeeById();
                case 3 -> getAllEmployees();
                case 4 -> updateEmployee();
                case 5 -> deleteEmployee();
                case 6 -> System.out.println("Назад");
            }
        } while (commander != 6);
    }

    private void createEmployee() {
        System.out.print("\nВведите имя работника: ");
        String firstname = scanner.nextLine();

        System.out.print("Введите фамилию работника: ");
        String lastname = scanner.nextLine();

        EmployeeStatus status = EmployeeStatus.ACTIVE;

        var newEmployee = employeeController.createEmployee(firstname, lastname, status);
        System.out.println("\nВ базу данных внесен новый работник книжного магазина" + newEmployee);
    }

    private void getEmployeeById() {
    }

    private void getAllEmployees() {
        var allEmployees = employeeController.getAllEmployees();
        allEmployees.forEach(System.out::println);
    }

    private void updateEmployee() {

    }

    private void deleteEmployee() {

    }

}
