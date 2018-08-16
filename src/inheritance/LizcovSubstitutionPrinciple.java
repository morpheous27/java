package inheritance;

public class LizcovSubstitutionPrinciple {

	public static void main(String[] args) {

		Account act1 = new CASAAccount();
		Account act2 = new LOANAccount();

	}
}

interface Account // rbi
{

	public void debit();

	public void credit();

}

class CASAAccount implements Account // icici
{
	int accountNo;

	public void debit() {
		accountNo = accountNo - 100;
	}

	public void credit() {
		accountNo = accountNo + 100;
	}

	public void gadbadMethod() {
		accountNo = accountNo + 10000000;
	}
}

class LOANAccount implements Account // hdfc
{
	int accountNo;

	public void debit() {
		accountNo = accountNo - 100;
	}

	public void credit() {
		accountNo = accountNo + 100;
	}

	public void gadbadMethod() {
		accountNo = accountNo + 10000000;
	}
}
