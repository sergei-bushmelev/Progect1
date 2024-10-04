public class Main {
    public static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Иванов Иван Иванович", 1, 10_000);
        employees[1] = new Employee("Петров Петр Петрович", 2, 20_000);
        employees[2] = new Employee("Сергеев Сергей Сергеевич", 3, 30_000);
        employees[3] = new Employee("Сидоров Сидор Сидорович", 4, 40_000);
        employees[4] = new Employee("Степанов Степан Степанович", 5, 50_000);

        printAllInformatoinOfPersons();
        System.out.println("Сумма всех зарплат равна: " + countAllSalary());
        System.out.println("Самая маленькая зарплата у сотрудника: " + findEmployeeWithMinSalary());
        System.out.println("Самая большая зарплата у сотрудника: " + findEmployeeMaxSalary());
        System.out.println("Средняя зарплата в организации: " + countAverageSalary());
        printAllNamesOfEmployees();
    }

    public static void printAllInformatoinOfPersons() {
        for (int i = 0; i < Employee.count; i++) {
            System.out.println(employees[i]);
        }
    }

    public static int countAllSalary() {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            Employee employee = Main.employees[i];
            if (employee != null) {
                sum = sum + employee.getSalary();
            }
        }
        return sum;
    }

    public static Employee findEmployeeWithMinSalary() {
        Employee minSalaryEmployee = employees[0];
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee != null) {
                if (employee.getSalary() < minSalaryEmployee.getSalary()) {
                minSalaryEmployee = employee;
                }
            }
        }
        return minSalaryEmployee;
    }

    public static Employee findEmployeeMaxSalary() {
        Employee maxSalaryEmployee = employees[0];

        for (int i = 0; i < Employee.count; i++) {
            Employee employee = employees[i];
            if (employee != null) {
                if (employee.getSalary() > maxSalaryEmployee.getSalary()) {
                    maxSalaryEmployee = employee;
                }
            }
        }
        return maxSalaryEmployee;
    }

    public static double countAverageSalary() {
        double averageSalary = countAllSalary() / Employee.count;
        return averageSalary;
    }

    public static void printAllNamesOfEmployees(){
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if(employee != null){
                System.out.println(employee.getName());
            }
        }
    }
}