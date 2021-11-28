package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.Employee;

public class CredentialService {

	public String generateEmailAddress(Employee employee) {
		return employee.getFirstName() + employee.getLastName() + "@" + employee.getDepartment().toLowerCase() + ".abc.com";
	}

	/**
	 * Generate a 8 digit password which can have capital letters, small
	 * letters,numbers, special characters
	 */
	public String generatePassword() {

		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*_=+-/.?<>)";

		String allowedChars = capitalLetters + smallLetters + numbers + specialCharacters;

		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		for (int count = 1; count <= 8; count++) {
			sb.append(allowedChars.charAt(random.nextInt(allowedChars.length())));
		}
		return sb.toString();
	}

	public void showCredentials(Employee employee) {
		System.out.println("Dear " +  employee.getFirstName() + " your generated credentials are as follows");
		System.out.println("Email    ---> " + this.generateEmailAddress(employee));
		System.out.println("Password ---> " + this.generatePassword());
	}

}
