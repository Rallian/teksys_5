package coreJavaManagerAndTrainee;

public class Manager extends Employee{

	public Manager(long Id, String name, String address, long phone, double salary) {
		super(Id, name, address, phone);
		this.setBasicSalary(salary);
	}
	
	public void calculateTransportAllowance() {
		double transportAllowance = 15*getBasicSalary()/100;
		System.out.println(transportAllowance);
	}

}
