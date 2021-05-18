package Day4GameProject.Business.abstracts;

import Day4GameProject.Entities.concretes.Gamer;

public interface GamerService {
	
	void add(Gamer gamer);
	void update(Gamer gamer);
	void delete(Gamer gamer);

}
