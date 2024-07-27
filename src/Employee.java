public class Employee extends Person {
    private String position;
    private double salary; //type double used to accurately represent salaries

    // Default constructor
    public Employee() {
        super();
        this.position = "Ride Operator"; // It was thought that Ride Operators would be the primary position of employees
        this.salary = 50000.0; // 50000 was an arbitrary value that seemed appropriate
    }

    // Constructor with parameters
    public Employee(String fullName, int age, String gender, String position, double salary) {
        super(fullName, age, gender);
        this.position = position;
        this.salary = salary;
    }

    // Getters and Setters
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
