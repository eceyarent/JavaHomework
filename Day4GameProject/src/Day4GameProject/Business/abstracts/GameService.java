package Day4GameProject.Business.abstracts;

import Day4GameProject.Entities.concretes.Game;


public interface GameService {
	
	void add(Game game);
	void update(Game game);
	void delete(Game game);

}
