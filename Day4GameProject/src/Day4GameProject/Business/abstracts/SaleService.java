package Day4GameProject.Business.abstracts;

import Day4GameProject.Entities.concretes.Campaign;
import Day4GameProject.Entities.concretes.Game;
import Day4GameProject.Entities.concretes.Gamer;

public interface SaleService {
	
	void sale(Game game,Gamer gamer);
	void saleWithCampaign(Game game, Gamer gamer,Campaign campaign);

}
