package ru.khamzin.view;

import ru.khamzin.controller.EmployeeController;
import ru.khamzin.repository.EmployeeRepository;
import ru.khamzin.repository.impl.EmployeeRepositoryImpl;
import ru.khamzin.util.InputValidChoiceUtil;

public class ApplicationContext {
    private static final int MIN_CHOICE = 1;
    private static final int MAX_CHOICE = 5;

    public void start() {
        int commander;
        do {
            System.out.println("\nВыберите из списка:");
            System.out.println("1. Работники книжного магазина");
            System.out.println("2. Покупатели книжного магазина");
            System.out.println("3. Книги");
            System.out.println("4. Заказы");
            System.out.println("5. Выйти");

            commander = InputValidChoiceUtil.readValidChoice(MIN_CHOICE, MAX_CHOICE);
            switch (commander) {
                case 1 -> employeeRun();
                case 2 -> buyerRun();
                case 3 -> bookRun();
                case 4 -> orderRun();
            }
        } while (commander != 5);
    }

    private void employeeRun() {
        EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();
        EmployeeController employeeController = new EmployeeController(employeeRepository);
        EmployeeView employeeView = new EmployeeView(employeeController);
        employeeView.run();
    }

    private void buyerRun() {

    }

    private void bookRun() {

    }

    private void orderRun() {

    }
}
