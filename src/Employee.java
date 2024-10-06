import java.util.Objects;

public class Employee {
    static int count;
    private final String name;
    private int id;
    private int department;
    private double salary;

    public Employee(String name, int department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        id = count++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return " name='" + name + '\'' +
                ", id=" + id +
                ", department=" + department +
                ", salary=" + salary;
    }

    public String toStringWithoutDepartment() {
        return " name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && Objects.equals(name, employee.name) && Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, department, salary);
    }
}
