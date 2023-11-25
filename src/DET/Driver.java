package DET;

import java.util.*;

public class Driver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = in.nextLine();

        System.out.print("Enter last name: ");
        String lastName = in.nextLine();

        System.out.print("Enter social security number: ");
        String socialSecurityNumber = in.nextLine();

        System.out.print("Enter hourly wage: ");
        double wage = in.nextDouble();

        System.out.print("Enter hours worked: ");
        double hours = in.nextDouble();

        HourlyEmployee hourlyEmployee = new HourlyEmployee(firstName, lastName, socialSecurityNumber, wage, hours);

        System.out.println(hourlyEmployee.toString());
    }
}
