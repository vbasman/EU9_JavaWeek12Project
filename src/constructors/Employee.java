package constructors;

public class Employee {
    public String name, jobTitle;
    public int ID;
    public double salary;

    public void setInfo(String name, String jobTitle, int ID, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.ID = ID;
        this.salary = salary;
    }
}
