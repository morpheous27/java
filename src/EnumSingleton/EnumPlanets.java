package EnumSingleton;

enum EnumPlanets {

	Earth(2, 3), Mars(4, 5);

	private int a;
	private int b;

	EnumPlanets(int a, int b) {
		this.a = a;
		this.b = b;
	}

	int Product() {
		return a * b;
	}

}
