package eCommerceSystem.DataAccess.abstracts;

import java.util.List;

import eCommerceSystem.Entities.concretes.User;

public interface UserDao {
	
	void add(User user);
	void delete(User user);
	void update(User user);
	User getById(int id);
	User getByMail(String email);
	User getByEmailAndPassword(String email, String password);
	List<User> getAll();

}
