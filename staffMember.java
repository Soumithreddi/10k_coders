package oops_complete.com;

public class staffMember extends University_employee{
	private String designation;
	private double overtimeHours;
	
	

	@Override
	public void displayDetails() {
		printBasicInfo();
		System.out.println("staff_desg: "+getDesignation());
		System.out.println("OverTime: "+getOvertimeHours());
		
	}
	@Override
	public double caluculateSalary() {
		int base_salary=40000;
		double over_pay=25*getOvertimeHours()+base_salary;
		return over_pay;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getOvertimeHours() {
		return overtimeHours;
	}

	public void setOvertimeHours(double overtimeHours) {
		this.overtimeHours = overtimeHours;
	}
	
}
