package objectCompare;

import java.util.HashMap;
import java.util.Map;

public class ObjectCompare {

	Map map = new HashMap();

	public static void main(String[] args) {

		ObjectCompare oc = new ObjectCompare();
		CddEntity oldCddEntity = getOldCddEntity();
		CddEntity newCddEntity = getNewCddEntity();
		//
		if (oldCddEntity.equals(newCddEntity)) {
			for (Object str : oldCddEntity.map.keySet()) {
				System.out.println(oldCddEntity.map.get(str));
			}
		} else {
			for (Object str : oldCddEntity.map.keySet()) {
				System.out.println(oldCddEntity.map.get(str));
			}
		}

	}

	private static CddEntity getOldCddEntity() {
		FinancialInfo f = new FinancialInfo(10);
		CDueDiligence cdd = new CDueDiligence(f);

		CddEntity cddEntity = new CddEntity("old", cdd, new User("nitin", "mumbai"), new AmlRiskSummary(1, "one"));

		return cddEntity;
	}

	private static CddEntity getNewCddEntity() {
		FinancialInfo f = new FinancialInfo(11);
		CDueDiligence cdd = new CDueDiligence(f);

		CddEntity cddEntity = new CddEntity("New", cdd, new User("nitin", "bareilly"), new AmlRiskSummary(1, "one"));
		return cddEntity;
	}

}
