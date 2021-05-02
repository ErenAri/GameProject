package kodlamaIO_GameProject;

public class Campaign{

	private int id;
	private String CampaignName;
	private String CampaignInfo;
	private String CampaignDuration;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCampaignName() {
		return CampaignName;
	}
	public void setCampaignName(String campaignName) {
		CampaignName = campaignName;
	}
	public String getCampaignInfo() {
		return CampaignInfo;
	}
	public void setCampaignInfo(String campaignInfo) {
		CampaignInfo = campaignInfo;
	}
	public String getCampaignDuration() {
		return CampaignDuration;
	}
	public void setCampaignDuration(String campaignDuration) {
		CampaignDuration = campaignDuration;
	}

}
