package task1;

import task1.employee.Accountant;
import task1.employee.Director;
import task1.employee.Employee;
import task1.employee.Worker;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Employee[] employees = {
                new Director(),
                new Accountant(),
                new Worker()
        };
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите код должности");
        int jobTitleCode = scanner.nextInt();
        boolean isCodeExists = false;
        for (Employee employee : employees) {
            if (employee.jobTitleCode == jobTitleCode) {
                employee.printJobTitle();
                isCodeExists = true;
            }
        }
        if (!isCodeExists) {
            System.out.println("введенный код \"" + jobTitleCode + "\" не существует");
        }
    }

}
