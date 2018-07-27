import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;

class EmployeeVO {
	String empID, empName;
	double annualIncome, incomeTax;

	public EmployeeVO(String empID, String empName, double annualIncome, double incomeTax) {
		this.empID = empID;
		this.empName = empName;
		this.annualIncome = annualIncome;
		this.incomeTax = incomeTax;
	}

	public EmployeeVO() {
		// DO NOTHING
	}

	/**
	 * @return the empID
	 */
	public String getEmpID() {
		return empID;
	}

	/**
	 * @param empID
	 *            the empID to set
	 */
	public void setEmpID(String empID) {
		this.empID = empID;
	}

	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}

	/**
	 * @param empName
	 *            the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	/**
	 * @return the annualIncome
	 */
	public double getAnnualIncome() {
		return annualIncome;
	}

	/**
	 * @param annualIncome
	 *            the annualIncome to set
	 */
	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}

	/**
	 * @return the incomeTax
	 */
	public double getIncomeTax() {
		return incomeTax;
	}

	/**
	 * @param incomeTax
	 *            the incomeTax to set
	 */
	public void setIncomeTax(double incomeTax) {
		this.incomeTax = incomeTax;
	}

	@Override
	public String toString() {
		return "EmpID=" + empID + "\nEmpName=" + empName + "\nAnnualIncome=" + annualIncome + "\nIncomeTax=" + incomeTax+ "\n----";
	}

	@Override
	public int hashCode() {
		final int prime = 37;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(annualIncome);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((empID == null) ? 0 : empID.hashCode());
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		temp = Double.doubleToLongBits(incomeTax);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeVO other = (EmployeeVO) obj;
		if (Double.valueOf(annualIncome) != Double.valueOf(other.annualIncome))
			return false;
		if (empID == null) {
			if (other.empID != null)
				return false;
		} else if (!empID.equals(other.empID))
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		if (Double.valueOf(incomeTax) != Double.valueOf(other.incomeTax))
			return false;
		return true;
	}

}

class EmployeeBO {
	void calIncomeTax(EmployeeVO emp) {
		double incTax = 0;

		if (emp.getAnnualIncome() > 400000)
			incTax = 0.2 * emp.getAnnualIncome();
		else if (emp.getAnnualIncome() > 300000)
			incTax = 0.15 * emp.getAnnualIncome();
		else
			incTax = 0.1 * emp.getAnnualIncome();
		emp.setIncomeTax(incTax);
	}

	class EmployeeSort implements Comparator {

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.util.Comparator#compareTo(java.lang.Object, java.lang.Object)
		 */

		@Override
		public int compare(Object o1, Object o2) {
			EmployeeVO e1 = (EmployeeVO) o1;
			EmployeeVO e2 = (EmployeeVO) o2;
			return Double.compare(e1.annualIncome, e2.annualIncome);
		}

	}
}

public class Exercise1_2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter number of employees: ");

		int num = Integer.parseInt(br.readLine());

		EmployeeVO arr[] = new EmployeeVO[num];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = new EmployeeVO();
			System.out.println("Enter details of Employee " + ((int) i + 1));
			System.out.println("-----");
			System.out.println("Enter ID");
			arr[i].setEmpID(br.readLine());
			System.out.println("Enter Name");
			arr[i].setEmpName(br.readLine());
			System.out.println("-----");
			System.out.println("Enter Annual Income:");
			arr[i].setAnnualIncome(Double.parseDouble(br.readLine()));
			new EmployeeBO().calIncomeTax(arr[i]);
			System.out.println("CAlculated tax -----");
		}

		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].toString());
		}
		System.out.println("END--");
		
	}
}
