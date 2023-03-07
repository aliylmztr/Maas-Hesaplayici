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
        double tax;
        if (this.salary < 1000) {
            return 0;
        } else {
            tax = this.salary * 0.03;
            return tax;
        }
    }

    double bonus() {
        double bonus;
        int extraHours;
        if (this.workHours >= 40) {
            extraHours = this.workHours - 40;
            bonus = extraHours * 30;
            return bonus;
        } else {
            return 0;
        }
    }

    double raiseSalary() {
        int year = 2021;
        int workYears = year - this.hireYear;
        double raiseSalary = 1.0;
        if (workYears < 10) {
            raiseSalary = this.salary * 0.05;
            return raiseSalary;
        } else if (workYears > 9 && workYears < 20) {
            raiseSalary = this.salary * 0.10;
            return raiseSalary;
        } else if (workYears > 19) {
            raiseSalary = this.salary * 0.15;
            return raiseSalary;
        }
        return 0;
    }

    void taxAndBonus() {
        double taxAndBonus;
        taxAndBonus = this.salary - this.tax() + this.bonus();
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + taxAndBonus);
    }

    void totalSalary() {
        double totalSalary;
        totalSalary = this.salary + this.raiseSalary();
        System.out.println("Toplam Maaş : " + totalSalary);
    }

    void toStringPrint() {
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maaş Artışı : " + raiseSalary());
    }

}
