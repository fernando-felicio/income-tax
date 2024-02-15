package application;
import java.util.Locale;
import java.util.Scanner;

import entities.enums.Status;

import java.util.List;
import java.util.ArrayList;

import entities.LegalPerson;
import entities.Person;
import entities.PhysicalPerson;



public class Program {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		List<Person> list = new ArrayList<>();
		
		System.out.print("How many people will be registered? ");
		int qttPeople = scanner.nextInt();
		scanner.nextLine();
		
		for (int i = 0; i < qttPeople; i++) {
			
			System.out.println("Person #" + (i + 1) + " data:");
			
			System.out.print("Physical Person or Legal Person (p/l) ?");
			String typeOfPerson = scanner.nextLine().toLowerCase();
			
			System.out.print("Name: ");
			String name = scanner.nextLine();
			
			System.out.print("Annual Income: ");
			Double annualIncome = scanner.nextDouble();
			scanner.nextLine();
			
			System.out.print("Status: ");
			Status status = Status.valueOf(scanner.nextLine().toUpperCase());
			
			if (typeOfPerson.charAt(0) == 'p') {
				
				System.out.print("Health Expenses: ");
				Double healthExpenses = scanner.nextDouble();
				scanner.nextLine();
				
				list.add(new PhysicalPerson(name, annualIncome, status, healthExpenses));
			}
			
			else {
				System.out.print("Number of Employees: ");
				Integer numberOfEmployees = scanner.nextInt();
				scanner.nextLine();
				
				list.add(new LegalPerson(name, annualIncome, status, numberOfEmployees));
			}
			
		}
		
		System.out.println("TAX INFORMATION: ");
		
		for (Person taxList : list) {
			System.out.printf("%s - %.2f %n", taxList.getName() , taxList.taxRules());
		}
		
		
		scanner.close();
		
		//
		
		
	}

}
