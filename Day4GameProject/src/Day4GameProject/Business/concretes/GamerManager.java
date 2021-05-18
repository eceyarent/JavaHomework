package Day4GameProject.Business.concretes;

import Day4GameProject.Business.abstracts.GamerCheckService;
import Day4GameProject.Business.abstracts.GamerService;
import Day4GameProject.Entities.concretes.Gamer;

public class GamerManager implements GamerService{
	GamerCheckService gamerCheckService;
	
	public GamerManager(GamerCheckService gamerCheckService) {
		super();
		this.gamerCheckService=gamerCheckService;
	}

	@Override                      
	public void add(Gamer gamer) {
		if(gamerCheckService.CheckIfRealPerson(gamer))
		{
			System.out.println("Added to db : " + gamer.getFirstName());
		}
		else 
		{
			System.out.println("Not a valid person");
		}
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Gamer updated" + gamer.getFirstName());
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Gamer deleted" + gamer.getFirstName());
		
	}

}
