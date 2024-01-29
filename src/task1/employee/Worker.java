package task1.employee;

public class Worker extends Employee{
    public Worker() {
        super("Рабочий", 3);
    }
    public void printJobTitle() {
        System.out.println(this.jobTitle);
    }
}
