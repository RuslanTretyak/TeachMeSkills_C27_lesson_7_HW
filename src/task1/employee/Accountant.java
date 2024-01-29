package task1.employee;

public class Accountant extends Employee{
    public Accountant() {
        super("Бухгалтер", 2);
    }
    @Override
    public void printJobTitle() {
        System.out.println(this.jobTitle);
    }
}
