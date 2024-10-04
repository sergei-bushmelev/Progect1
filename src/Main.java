import java.util.Arrays;

public class Main {
    public static Employee[] employees;

    public static void main(String[] args) {
        employees = new Employee[10];
        employees[0] = new Employee("Иванов Иван Иванович", 1, 10_000);
        employees[1] = new Employee("Петров Петр Петрович", 2, 20_000);
        employees[2] = new Employee("Сергеев Сергей Сергеевич", 3, 30_000);
        employees[3] = new Employee("Сидоров Сидор Сидорович", 4, 40_000);
        employees[4] = new Employee("Степанов Степан Степанович", 5, 50_000);
        for (int i = 0; i < Employee.count; i++) {
            System.out.println(employees[i]);
        }
        System.out.println();
        System.out.println("Сумма всех зарплат равна: " + countAllSalary(employees));
        System.out.println("Самая маленькая зарплата у сотрудника: " + findMinSalary(employees));
        System.out.println("Самая большая зарплата у сотрудника: " + findMaxSalary(employees));
        System.out.println("Средняя зарплата в организации: " + countAverageSalary(employees));
    }

    public static int countAllSalary(Employee[] employees) {
        int sum = 0;
        for (int i = 0; i < Employee.count; i++) {
            Employee employee = employees[i];
            sum = sum + employee.getSalary();
        }
        return sum;
    }

    public static String findMinSalary(Employee[] employees) {
        int minSalary = Integer.MAX_VALUE;
        String namePersonWithMinSalary = null;
        for (int i = 0; i < Employee.count; i++) {
            Employee employee = employees[i];
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                namePersonWithMinSalary = employee.getName();
            }
        }
        return namePersonWithMinSalary;
    }

    public static String findMaxSalary(Employee[] employees) {
        int minSalary = Integer.MIN_VALUE;
        String namePersonWithMaxSalary = null;
        for (int i = 0; i < Employee.count; i++) {
            Employee employee = employees[i];
            if (employee.getSalary() > minSalary) {
                minSalary = employee.getSalary();
                namePersonWithMaxSalary = employee.getName();
            }
        }
        return namePersonWithMaxSalary;
    }

    public static int countAverageSalary(Employee[] employees) {
        int averageSalary = countAllSalary(employees) / Employee.count;
        return averageSalary;
    }
}