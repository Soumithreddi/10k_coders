package oops_complete.com;

public abstract class University_employee {
	private String employye_id;
	private String name;

	public void setEmployye_id(String employye_id) {
		this.employye_id = employye_id;
	}

	public void setName(String name) {
		this.name = name;
	}
	public abstract double caluculateSalary();
	public abstract void displayDetails();

	public String getEmployye_id() {
		return employye_id;
	}

	public String getName() {
		return name;
	}

	public void printBasicInfo() {
		System.out.println("employeeId: "+getEmployye_id());
		System.out.println("name: "+getName());
	}
}



