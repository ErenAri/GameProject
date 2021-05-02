package kodlamaIO_GameProject;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println("Yeni kampanya eklendi: "+campaign.getCampaignName());
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya kald�r�ld�: "+campaign.getCampaignName());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya g�ncellendi: "+campaign.getCampaignName());
		
	}

}
