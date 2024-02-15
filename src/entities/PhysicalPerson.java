package entities;

public class PhysicalPerson {
	
	private String name;
	private Double annualIncome;
	private Double healthExpenses;
	
	public PhysicalPerson() {
		super();		
	}
	
	public PhysicalPerson(String name, Double annualIncome, Double healthExpenses) {
		super();
		this.name = name;
		this.annualIncome = annualIncome;
		this.healthExpenses = healthExpenses;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public Double getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(Double annualIncome) {
		this.annualIncome = annualIncome;
	}

	public Double getHealthExpenses() {
		return healthExpenses;
	}

	public void setHealthExpenses(Double healthExpenses) {
		this.healthExpenses = healthExpenses;
	}
	
	

}
