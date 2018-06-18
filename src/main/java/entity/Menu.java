package entity;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Pattern;

public class Menu {
	
	private int id;
	@Pattern(regexp="[A-Za-z\\s]{3,100}+", message="Klaidingai grupes pavadinimas!")
	private String group;
	@Pattern(regexp="[A-Za-z\\s]{3,100}+", message="Klaidingai patiekalo pavadinimas!")
	private String name;
	@Digits(integer=6, fraction=0, message="Tiek daug kaloriju negali buti!")
	private int calory;
	@Digits(integer=3, fraction=2, message="Tik du skaiciai po kablelio arba per brangu")
	private double price;
	
	public Menu () {
		
	}
	
	public Menu(int id, String group, String name, int calory, double price) {
		super();
		this.id = id;
		this.group = group;
		this.name = name;
		this.calory = calory;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCalory() {
		return calory;
	}

	public void setCalory(int calory) {
		this.calory = calory;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	
	
}
