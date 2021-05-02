package kodlamaIO_GameProject;

public class UserValidationManager implements UserValidationService{

	@Override
	public boolean CheckCustomer(Customer customer) {
		
		if(customer.getBirthYear() < 2003 && customer.getNationalyIdentity() > 4 ) {
			System.out.println("Kullan�c� Do�ruland�");
			return true;
		}
		else {
			System.out.println("Kullan�c� Do�rulanamad�!");
			return false;
		}
	}

}
