package objectCompare;

public class AmlRiskSummary implements BaseMap {

	int a;
	String b;

	public AmlRiskSummary(int a, String b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		result = prime * result + ((b == null) ? 0 : b.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null) {
			map.put(getClass(), getClass());
			return false;
		}
		if (getClass() != obj.getClass()) {
			map.put(getClass(), getClass().getName());
			return false;
		}
		AmlRiskSummary other = (AmlRiskSummary) obj;
		if (a != other.a) {
			map.put(getClass(), getClass().getName());
			return false;
		}
		if (b == null) {
			if (other.b != null) {
				map.put(getClass(), getClass().getName());
				return false;
			}
		} else if (!b.equals(other.b)) {
			map.put(getClass(), getClass().getName());
			return false;
		}
		return true;
	}

}
