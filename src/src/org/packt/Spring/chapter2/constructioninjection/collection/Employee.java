package src.org.packt.Spring.chapter2.constructioninjection.collection;

public class Employee {
	
	String employeeName;

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	@Override
	public String toString() {
		return "EmployeeName: " + employeeName;
	}

}
