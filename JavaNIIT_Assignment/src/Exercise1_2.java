
class EmployeeVO {
	String empID, empName;
	double annualIncome, incomeTax;
	public String getEmpID() {
		return empID;
	}
	public void setEmpID(String empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getAnnualIncome() {
		return annualIncome;
	}
	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}
	public double getIncomeTax() {
		return incomeTax;
	}
	public void setIncomeTax(double incomeTax) {
		this.incomeTax = incomeTax;
	}
	@Override
	public String toString() {
		return "EmpID=" + empID + "\nEmpName=" + empName + "\nAnnualIncome=" + annualIncome + "\nIncomeTax="
				+ incomeTax ;
	}
	
	
}

public class Exercise1_2 {

}
