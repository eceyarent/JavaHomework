package Day4GameProject.Business.abstracts;

import Day4GameProject.Entities.concretes.Campaign;

public interface CampaignService {

	
	void add(Campaign campaign);
	void update(Campaign campaign);
	void delete(Campaign campaign);
}
