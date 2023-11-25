package DET;

public class HourlyEmployee extends Employee {
    private double hours;
    private double wage;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber);
        setWage(wage);
        setHours(hours);
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if (wage >= 0) {
            this.wage = wage;
        } else {
            throw new IllegalArgumentException("Wage must be non-negative.");
        }
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if (hours >= 0 && hours <= 168) {
            this.hours = hours;
        } else {
            throw new IllegalArgumentException("Hours must be between 0 and 168.");
        }
    }

    public double earnings() {
        return wage * hours;
    }

    @Override
    public String toString() {
        return String.format("Hourly Employee: %s%nWage: $%.2f%nHours Worked: %.2f%nEarnings: $%.2f",
                super.toString(), getWage(), getHours(), earnings());
    }
}
