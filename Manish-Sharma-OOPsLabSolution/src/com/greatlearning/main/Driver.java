package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialService;

public class Driver {

	public static void main(String[] s) {

		String firstName;
		String lastName;
		int choice;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First Name:");
		firstName = sc.nextLine();

		System.out.println("Enter Last Name:");
		lastName = sc.nextLine();

		System.out.println("Enter your Department Choice:");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");

		choice = Integer.parseInt(sc.nextLine());
		sc.close();

		System.out.println("Hello " + firstName + "," + lastName);
		System.out.println("Department: " + getDepartmentAsString(choice));

		Employee employee = getEmployee(firstName, lastName, choice);

		CredentialService credentialService = new CredentialService();

		credentialService.showCredentials(employee);
	}

	private static String getDepartmentAsString(int choice) {

		String department;

		switch (choice) {

		case 1:
			department = "Tech";
			break;
		case 2:
			department = "Adm";
			break;
		case 3:
			department = "HR";
			break;
		case 4:
			department = "Lg";
			break;
		default:
			department = "Not defined";
		}
		return department;
	}

	private static Employee getEmployee(String firstName, String lastName, int choice) {

		Employee employee;

		switch (choice) {

		case 1:
			employee = new Employee(firstName, lastName, getDepartmentAsString(1));
			break;
		case 2:
			employee = new Employee(firstName, lastName, getDepartmentAsString(2));
			break;
		case 3:
			employee = new Employee(firstName, lastName, getDepartmentAsString(3));
			break;
		case 4:
			employee = new Employee(firstName, lastName, getDepartmentAsString(4));
			break;
		default:
			throw new IllegalArgumentException("Undefined");
		}
		return employee;
	}

}
