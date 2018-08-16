package objectCompare;

public class User implements BaseMap {

	String uName;
	String city;

	public User(String uName, String city) {
		super();
		this.uName = uName;
		this.city = city;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((uName == null) ? 0 : uName.hashCode());
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
		User other = (User) obj;
		if (city == null) {
			if (other.city != null) {
				map.put(getClass(), getClass().getName());
				return false;
			}
		} else if (!city.equals(other.city)) {
			map.put(getClass(), getClass().getName());
			return false;
		}
		if (uName == null) {
			if (other.uName != null) {
				map.put(getClass(), getClass().getName());
				return false;
			}
		} else if (!uName.equals(other.uName)) {
			map.put(getClass(), getClass().getName());
			return false;
		}
		return true;
	}

}
