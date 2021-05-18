package Day4GameProject.Business.concretes;

import Day4GameProject.Business.abstracts.GamerCheckService;
import Day4GameProject.Entities.concretes.Gamer;

public class GamerCheckManager implements GamerCheckService {

	@Override
	public Boolean CheckIfRealPerson(Gamer gamer) {
		
		return true;
	}

}
