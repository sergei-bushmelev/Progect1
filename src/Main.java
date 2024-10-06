public class Main {
    public static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Иванов Иван Иванович", 1, 10_000);
        employees[1] = new Employee("Петров Петр Петрович", 1, 20_000);
        employees[2] = new Employee("Сергеев Сергей Сергеевич", 3, 30_000);
        employees[3] = new Employee("Сидоров Сидор Сидорович", 4, 40_000);
        employees[4] = new Employee("Степанов Степан Степанович", 5, 5_000);

        indexingSalary();
        indexingSalaryOfDepartment(1);
        printAllInformationOfPersons();
        printAllInformationOfPersonsOfDepartment(1);
        findEmployeeWithLowerSalary();
        findEmployeeWithUpperSalary();
        System.out.println("Сумма всех зарплат равна: " + countAllSalary());
        System.out.println("Самая маленькая зарплата у сотрудника: " + findEmployeeWithMinSalary());
        System.out.println("Самая большая зарплата у сотрудника: " + findEmployeeMaxSalary());
        System.out.println("Средняя зарплата в организации: " + countAverageSalary());
        System.out.println("Сумма всех зарплат в отделе равна: " + calculateTotalSalaryOfDepartment(1));
        System.out.println("Самая маленькая зарплата в отделе равна: " + findEmployeeWithMinSalaryOfDepartment(1));
        System.out.println("Самая большая зарплата в отделе равна: " + findEmployeeWithMaxSalaryOfDepartment(1));
        System.out.println("Средняя зарплата в отделе равна: " + countAverageSalaryOfDepartment(1));
        printAllNamesOfEmployees();
    }

    public static void indexingSalary() {
        double index = 0.1;
        double newSalary;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                newSalary = employees[i].getSalary() + employees[i].getSalary() * index;
                employees[i].setSalary(newSalary);
            }
        }
    }

    public static void printAllInformationOfPersons() {
        for (int i = 0; i < Employee.count; i++) {
            System.out.println(employees[i]);
        }
    }

    public static double countAllSalary() {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                sum = sum + employees[i].getSalary();
            }
        }
        return sum;
    }

    public static double calculateTotalSalaryOfDepartment(int department) {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == department) {
                sum = sum + employees[i].getSalary();
            }
        }
        return sum;
    }

    public static Employee findEmployeeWithMinSalaryOfDepartment(int department) {
        Employee minSalaryEmployee = employees[department];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == department) {
                if (employees[i].getSalary() < minSalaryEmployee.getSalary()) {
                    minSalaryEmployee = employees[i];
                }
            }
        }
        return minSalaryEmployee;
    }

    public static Employee findEmployeeWithMaxSalaryOfDepartment(int department) {
        Employee maxSalaryEmployee = employees[department];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == department) {
                if (employees[i].getSalary() > maxSalaryEmployee.getSalary()) {
                    maxSalaryEmployee = employees[i];
                }
            }
        }
        return maxSalaryEmployee;
    }

    public static double countAverageSalaryOfDepartment(int department) {
        int personOfDepartment = 0;
        double sum = 0;
        double averageSalaryOfDepartment;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == department) {
                sum = sum + employees[i].getSalary();
                personOfDepartment++;
            }
        }
        averageSalaryOfDepartment = sum / personOfDepartment;
        return averageSalaryOfDepartment;
    }

    public static void printAllInformationOfPersonsOfDepartment(int department) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == department) {
                System.out.println(employees[i].toStringWithoutDepartment());
            }
        }
    }

    public static void indexingSalaryOfDepartment(int department) {
        double index = 0.1;
        double newSalary;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == department) {
                newSalary = employees[i].getSalary() + employees[i].getSalary() * index;
                employees[i].setSalary(newSalary);
            }
        }
    }

    public static void findEmployeeWithLowerSalary() {
        double levelSalary = 35_000;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getSalary() < levelSalary) {
                    System.out.println("Сотрудник с зарплатой ниже заданного уровня: " + employees[i].toStringWithoutDepartment());
                }
            }
        }
    }

    public static void findEmployeeWithUpperSalary() {
        double levelSalary = 35_000;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getSalary() >= levelSalary) {
                    System.out.println("Сотрудник с зарплатой выше заданного уровня: " + employees[i].toStringWithoutDepartment());
                }
            }
        }
    }

    public static Employee findEmployeeWithMinSalary() {
        Employee minSalaryEmployee = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getSalary() < minSalaryEmployee.getSalary()) {
                    minSalaryEmployee = employees[i];
                }
            }
        }
        return minSalaryEmployee;
    }

    public static Employee findEmployeeMaxSalary() {
        Employee maxSalaryEmployee = employees[0];
        for (int i = 0; i < Employee.count; i++) {
            if (employees[i] != null) {
                if (employees[i].getSalary() > maxSalaryEmployee.getSalary()) {
                    maxSalaryEmployee = employees[i];
                }
            }
        }
        return maxSalaryEmployee;
    }

    public static double countAverageSalary() {
        double averageSalary = countAllSalary() / Employee.count;
        return averageSalary;
    }

    public static void printAllNamesOfEmployees() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].getName());
            }
        }
    }
}
