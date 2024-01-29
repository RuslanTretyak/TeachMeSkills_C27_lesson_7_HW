package task1.employee;

public abstract class Employee implements Printable{
    public String jobTitle;
    public int jobTitleCode;

    public Employee(String jobTitle, int jobTitleCode) {
        this.jobTitle = jobTitle;
        this.jobTitleCode = jobTitleCode;
    }
}
