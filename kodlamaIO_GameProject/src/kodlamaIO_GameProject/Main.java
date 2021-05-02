package kodlamaIO_GameProject;

public class Main {

	public static void main(String[] args) {
		Campaign specialGamers = new Campaign();
		specialGamers.setId(1);
		specialGamers.setCampaignName("1 Yýllýk Oyuncularýmýza Özel Kampanya");
		specialGamers.setCampaignInfo("Itemlarda %75 varan indirimler!!!");
		specialGamers.setCampaignDuration("10.05.2021");
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(specialGamers);
		campaignManager.update(specialGamers);
		campaignManager.delete(specialGamers);
		
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		
		Customer customer1 = new Customer();
		customer1.setId(1);
		customer1.setFirstName("Eren");
		customer1.setLastName("Arý");
		customer1.setNationalyIdentity(1234567);
		customer1.setBirthDate(2000);
		
		CustomerManager customerManager = new CustomerManager(new UserValidationManager());
		customerManager.add(customer1);
		customerManager.update(customer1);
		customerManager.delete(customer1);
		
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		
		SalesManager salesManager = new SalesManager();
		salesManager.Discounts(specialGamers, customer1);
	}

}
