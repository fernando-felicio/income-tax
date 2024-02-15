package entities;
import entities.enums.Status;

public class LegalPerson extends Person {
	
	private Integer numberOfEmployees;
	
	public LegalPerson() {
		super();
	}
	
	public LegalPerson(String name, Double annualIncome, Status status, Integer numberOfEmployees) {
		super(name, annualIncome, status);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	public Double taxRules();
}
