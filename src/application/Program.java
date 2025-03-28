package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee data:");

        Employee func = new Employee();
        System.out.print("Name: ");
        func.name = sc.nextLine();
        System.out.print("Gross salary: ");
        func.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        func.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Employee: " + func);
        System.out.println();
        System.out.println("Which percentage to increase salary?");
        func.increaseSalary(sc.nextDouble());
        System.out.println();
        System.out.println("Updated data: " + func);

        sc.close();
    }
}
