package Day4GameProject.Business.concretes;

import Day4GameProject.Business.abstracts.SaleService;
import Day4GameProject.Entities.concretes.Campaign;
import Day4GameProject.Entities.concretes.Game;
import Day4GameProject.Entities.concretes.Gamer;

public class SaleManager implements SaleService{

	@Override
	public void sale(Game game, Gamer gamer) {
		System.out.println("game named "+game.getName() + " sold to gamer "+gamer.getFirstName());
		
	}

	@Override
	public void saleWithCampaign(Game game, Gamer gamer, Campaign campaign) {
		
		System.out.println("game named "+game.getName() + " discount applied "+campaign.getDiscount() +" sold to gamer "+gamer.getFirstName());
	}

}
