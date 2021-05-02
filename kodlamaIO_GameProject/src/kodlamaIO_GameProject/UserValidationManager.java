package kodlamaIO_GameProject;

public class UserValidationManager implements UserValidationService{

	@Override
	public boolean CheckCustomer(Customer customer) {
		
		if(customer.getBirthYear() < 2003 && customer.getNationalyIdentity() > 4 ) {
			System.out.println("Kullanýcý Doðrulandý");
			return true;
		}
		else {
			System.out.println("Kullanýcý Doðrulanamadý!");
			return false;
		}
	}

}
