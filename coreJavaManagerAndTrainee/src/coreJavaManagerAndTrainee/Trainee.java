package coreJavaManagerAndTrainee;

public class Trainee extends Employee{

	public Trainee(long Id, String name, String address, long phone, double salary) {
		super(Id, name, address, phone);
		this.setBasicSalary(salary);
	}

}
