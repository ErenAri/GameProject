package kodlamaIO_GameProject;

public class CustomerManager implements CustomerService{

	private UserValidationService _userValidationService;
	
	public CustomerManager(UserValidationService userValidationService) {
		this._userValidationService =userValidationService;
	}
	
	@Override
	public void add(Customer customer) {
		if(_userValidationService.CheckCustomer(customer)==true) {
			System.out.println("Yeni kullanýcý eklendi: "+customer.getFirstName());
		}
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Kullanýcý silindi: "+customer.getFirstName());
		
	}

	@Override
	public void update(Customer customer) {
		if(_userValidationService.CheckCustomer(customer)==true) {
			System.out.println("Kullanýcý güncellendi: "+customer.getFirstName());
		}
		
	}
	
}
