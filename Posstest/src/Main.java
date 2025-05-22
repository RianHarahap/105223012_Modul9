class Employee {
    String name;
    double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double calculateSalary() {
        return baseSalary;
    }

    public double calculateSalary(boolean withBonus) {
        if (withBonus) {
            return baseSalary + 1000000;
        }
        return baseSalary;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + calculateSalary());
    }
}

class SoftwareEngineer extends Employee {
    public SoftwareEngineer(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return baseSalary + 2000000;
    }

    public double calculateSalary(boolean withBonus) {
        if (withBonus) {
            return calculateSalary() + 1000000;
        }
        return calculateSalary();
    }

    @Override
    public void displayInfo() {
        System.out.println("=== Software Engineer ===");
        System.out.println("Name: " + name);
        System.out.println("Salary: " + calculateSalary());
    }
}

class DataScientist extends Employee {
    public DataScientist(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return baseSalary + 1500000;
    }

    public double calculateSalary(boolean withBonus) {
        if (withBonus) {
            return calculateSalary() + 750000;
        }
        return calculateSalary();
    }

    @Override
    public void displayInfo() {
        System.out.println("\nData Scientist");
        System.out.println("Name: " + name);
        System.out.println("Salary: " + calculateSalary());
    }
}

class Intern extends Employee {
    public Intern(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return baseSalary + 500000;
    }

    public double calculateSalary(boolean withBonus) {
        if (withBonus) {
            return calculateSalary() + 250000;
        }
        return calculateSalary();
    }

    @Override
    public void displayInfo() {
        System.out.println("=== Intern ===");
        System.out.println("Name: " + name);
        System.out.println("Salary: " + calculateSalary());
    }
}

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
            new SoftwareEngineer("Aliya", 3000000),
            new DataScientist("Harahap", 4000000),
            new Intern("Rian", 1000000)
        };

        for (Employee emp : employees) {
            emp.displayInfo();
            if (emp instanceof SoftwareEngineer) {
                System.out.println("Salary with bonus: " + ((SoftwareEngineer) emp).calculateSalary(true));
            } else if (emp instanceof DataScientist) {
                System.out.println("Salary with bonus: " + ((DataScientist) emp).calculateSalary(true));
            } else if (emp instanceof Intern) {
                System.out.println("Salary with bonus: " + ((Intern) emp).calculateSalary(true));
            }
            System.out.println();
        }
    }
}
