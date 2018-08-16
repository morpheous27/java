package objectCompare;

public class FinancialInfo implements BaseMap {
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + salary;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass()) {
			map.put(getClass(), getClass().getName());
			return false;
		}
		FinancialInfo other = (FinancialInfo) obj;
		if (salary != other.salary) {
			map.put("one", this.getClass().getName());
			return false;
		}
		return true;
	}

	int salary;

	public FinancialInfo() {
		// TODO Auto-generated constructor stub
	}

	FinancialInfo(int s) {
		salary = s;

	}

}
