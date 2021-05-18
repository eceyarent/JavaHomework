package Day4GameProject.Entities.concretes;

import Day4GameProject.Entities.abstracts.Entity;

public class Campaign implements Entity {
	
	private int id;
	private String name;
	private float discount;
	
	public Campaign() {}
	
	public Campaign(int id, String name, float discount) {
		super();
		this.id = id;
		this.name = name;
		this.discount = discount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}
	

}
