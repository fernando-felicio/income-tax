package entities;
import entities.enums.Status;

public abstract class Person {
	
	private String name;
	protected Double annualIncome;
	private Status status;
	
	public Person() {
		super();
	}
	
	public Person(String name, Double annualIncome, Status status) {
		this.name = name;
		this.annualIncome = annualIncome;
		this.status = status;
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

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	public abstract Double taxRules();

	public Double taxRules(Double annualIncome) {
		return null;
	}

}
