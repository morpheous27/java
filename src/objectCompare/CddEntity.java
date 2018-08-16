package objectCompare;

public class CddEntity implements BaseMap {
	String name;
	CDueDiligence cdd;
	User user;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aml == null) ? 0 : aml.hashCode());
		result = prime * result + ((cdd == null) ? 0 : cdd.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
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
		CddEntity other = (CddEntity) obj;
		if (aml == null) {
			if (other.aml != null) {
				map.put(getClass(), getClass().getName());
				return false;
			}
		} else if (!aml.equals(other.aml))
			return false;
		if (cdd == null) {
			if (other.cdd != null) {
				map.put(getClass(), getClass().getName());
				return false;
			}
		} else if (!cdd.equals(other.cdd)) {
			map.put(getClass(), getClass().getName());
			return false;
		}
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name)) {
			map.put(getClass(), getClass().getName());
			return false;
		}
		if (user == null) {
			if (other.user != null) {
				map.put(getClass(), getClass().getName());
				return false;
			}
		} else if (!user.equals(other.user)) {
			map.put(getClass(), getClass().getName());
			return false;
		}
		return true;
	}

	AmlRiskSummary aml;

	public CddEntity() {
		// TODO Auto-generated constructor stub
	}

	CddEntity(String n, CDueDiligence c, User user, AmlRiskSummary aml) {
		name = n;
		cdd = c;
		user = user;
		this.aml = aml;
	}

	// CustomerDueDiligence class

}
// FinancialInfo CLass
