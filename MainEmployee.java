package oops_complete.com;

public class MainEmployee {
    public static void main(String[] args) {
        FacultyMemeber f = new FacultyMemeber();
        f.setEmployye_id("A1");
        f.setName("Sunny");
        f.setDeparmentCode(101);
        f.setYearsOfService(5);
        f.displayDetails();
        System.out.println("Faculty Salary: " + f.caluculateSalary());
        
System.out.println("---------------------faculty------------------------------");
        staffMember s = new staffMember();
        s.setEmployye_id("B01");
        s.setName("Ravi");
        s.setDesignation("managaer");
        s.setOvertimeHours(10);
        s.displayDetails();
        System.out.println("Staff Salary: " + s.caluculateSalary());
    }
}
