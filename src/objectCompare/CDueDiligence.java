package objectCompare;

public class CDueDiligence implements BaseMap {
	FinancialInfo financialInfo;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((financialInfo == null) ? 0 : financialInfo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null) {
			map.put(getClass(), getClass().getName());
			return false;
		}
		if (getClass() != obj.getClass()) {
			map.put(getClass(), getClass().getName());
			return false;
		}
		CDueDiligence other = (CDueDiligence) obj;
		if (financialInfo == null) {
			if (other.financialInfo != null) {
				map.put(getClass(), getClass().getName());
				return false;
			}
		} else if (!financialInfo.equals(other.financialInfo)) {
			map.put(getClass(), getClass().getName());
			return false;
		}
		return true;
	}

	public CDueDiligence() {
		// TODO Auto-generated constructor stub
	}

	CDueDiligence(FinancialInfo f) {
		financialInfo = f;
	}

}
