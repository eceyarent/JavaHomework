package Day4GameProject.Business.concretes;

import Day4GameProject.Business.abstracts.GameService;
import Day4GameProject.Entities.concretes.Game;


public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println("Game added " + game.getName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Game updated " + game.getName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Game deleted " + game.getName());
		
	}

}
