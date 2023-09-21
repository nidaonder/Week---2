public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    double tax() {
        if (this.salary < 1000) {
            return 0;
        } else {
            return this.salary * 0.03;
        }
    }

    double bonus () {
        if (this.workHours <= 40) {
            return 0;
        } else {
            return (this.workHours - 40) * 30;
        }
    }

    double raiseSalary() {
        if (2021 - this.hireYear < 10) {
           return (this.salary * 0.05);
        } else if (2021 - this.hireYear > 10 && 2021 - this.hireYear < 20) {
            return (this.salary * 0.1);
        } else {
            return (this.salary * 0.15);
        }
    }

    @Override
    public String toString() {
        return "Adı : " + this.name
                + "\nMaaşı : " + this.salary
                + "\nÇalışma saati : " + this.workHours
                + "\nBaşlangıç yılı : " + this.hireYear;
    }
}
