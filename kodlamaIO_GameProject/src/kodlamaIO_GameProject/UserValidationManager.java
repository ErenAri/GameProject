package kodlamaIO_GameProject;

public class UserValidationManager implements UserValidationService{

	@Override
	public boolean CheckCustomer(Customer customer) {
		
		if(customer.getBirthYear() < 2003 && customer.getNationalyIdentity() > 4 ) {
			System.out.println("Kullanıcı Doğrulandı");
			return true;
		}
		else {
			System.out.println("Kullanıcı Doğrulanamadı!");
			return false;
		}
	}

}
