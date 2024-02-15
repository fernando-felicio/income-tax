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

	@Override
	public Double taxRules() {
		
		Double tax = 0.0;
		
		if (numberOfEmployees > 10) {
			tax += (annualIncome * 0.14);
			return tax;
		}
		else {
			tax += (annualIncome * 0.16);
			return tax;
		}
	}

	
}
