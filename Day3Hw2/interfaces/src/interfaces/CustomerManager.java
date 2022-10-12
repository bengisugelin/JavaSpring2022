package interfaces;

public class CustomerManager {
	private ICustomerDal customerDal;
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	public void add() {
		// is kodlari yazilir. musterinin adi girilmis mi , dogru mu girilmis vs is katmanlari burada yazilir.
		//OracleCustomerDal oracleCustomerDal = new OracleCustomerDal(); boyle yazarsak sistemi oracle a baglamis oluyoruz,
		customerDal.add();
	}

}
