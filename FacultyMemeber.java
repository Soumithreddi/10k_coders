package oops_complete.com;

public class FacultyMemeber extends University_employee{
	
	private int deparmentCode;
	private int yearsOfService;
	public int getYearsOfService() {
		return yearsOfService;
	}

	public void setYearsOfService(int yearsOfService) {
		this.yearsOfService = yearsOfService;
	}

	@Override
	public double caluculateSalary() {
		int base_salary=50000;
		double experenice=1000*getYearsOfService()+base_salary;
		return experenice;
	}

	@Override
	public void displayDetails() {
		printBasicInfo();
		System.out.println("deptcode: "+getDeparmentCode());
		System.out.println("yearsexp: "+getYearsOfService());
	}

	public int getDeparmentCode() {
		return deparmentCode;
	}

	public void setDeparmentCode(int deparmentCode) {
		this.deparmentCode = deparmentCode;
	}
	
}
