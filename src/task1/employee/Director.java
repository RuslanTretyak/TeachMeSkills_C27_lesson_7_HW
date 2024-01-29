package task1.employee;

public class Director extends Employee{
    public Director() {
        super("Директор", 1);
    }
    public void printJobTitle() {
        System.out.println(this.jobTitle);
    }
}
