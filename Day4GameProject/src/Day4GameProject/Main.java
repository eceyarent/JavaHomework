package Day4GameProject;

import java.time.LocalDate;


import Day4GameProject.Adapters.MernisServiceAdapter;
import Day4GameProject.Business.concretes.GameManager;
import Day4GameProject.Business.concretes.GamerManager;
import Day4GameProject.Business.concretes.SaleManager;
import Day4GameProject.Entities.concretes.Campaign;
import Day4GameProject.Entities.concretes.Game;
import Day4GameProject.Entities.concretes.Gamer;


public class Main {

	public static void main(String[] args) {
		
		GamerManager gamerManager=new GamerManager(new MernisServiceAdapter());
		
		Game game=new Game(1,"Fortnite",150);
		Gamer gamer=new Gamer(2, "Ece Yaren", "Taykutgül", LocalDate.of(1998,04,20),"38443691110");
		Campaign campaign=new Campaign(3, "Summer Campaign", 50);
		
		
		gamerManager.add(gamer);
		//gamerManager.update(gamer);
		//gamerManager.delete(gamer);
		
		
		GameManager gameManager = new GameManager();
		gameManager.add(game);
		//gameManager.update(game);
		//gameManager.delete(game);
		
	
		
		SaleManager saleManager =  new SaleManager();
		saleManager.sale(game, gamer);
	
		
		SaleManager saleManager2 = new SaleManager();
		saleManager2.saleWithCampaign(game, gamer, campaign);
		

	}

}
