package entities;
import entities.enums.Status;

public class PhysicalPerson extends Person {
		
	private Double healthExpenses;
	
	public PhysicalPerson() {
		super();
	}
	
	public PhysicalPerson(String name, Double annualIncome, Status status, Double heatlExpenses) {
		super(name, annualIncome, status);
		this.healthExpenses = heatlExpenses;
	}

	public Double getHealthExpenses() {
		return healthExpenses;
	}

	public void setHealthExpenses(Double healthExpenses) {
		this.healthExpenses = healthExpenses;
	}
	
	
	@Override
	public Double taxRules() {
		
		Double tax = 0.0;
				
		if (annualIncome < 20000.00) {
			tax += (annualIncome * 0.15) - (healthExpenses * 0.5);
			return tax;
		}
		else {
			tax += (annualIncome * 0.25) - (healthExpenses * 0.5);
			return tax;
		}		
		
	}


	
}
