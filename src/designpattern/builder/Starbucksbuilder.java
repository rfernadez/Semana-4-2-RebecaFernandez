package designpattern.builder;

public class Starbucksbuilder {

	private String drinkname;
	private int price;
	private String atributo;
	
	// set - get
	
	
	/**
	 * @return the drinkname
	 */
	public String getDrinkname() {
		return drinkname;
	}

	/**
	 * @param drinkname the drinkname to set
	 */
	public void setDrinkname(String drinkname) {
		this.drinkname = drinkname;
	}

	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * @return the atributo
	 */
	public String getAtributo() {
		return atributo;
	}

	/**
	 * @param atributo the atributo to set
	 */
	public void setAtributo(String atributo) {
		this.atributo = atributo;
	}

	/**
	 * @param drinkname
	 * @param price
	 * @param atributo
	 */
	public Starbucksbuilder(String drinkname, int price, String atributo) {
		super();
		this.drinkname = drinkname;
		this.price = price;
		this.atributo = atributo;
	}

	
	public void buildSize(){
		System.out.println("Que grande soy");
	}
	
	public void buildDrink(){
		System.out.println("Que soy?");
	}
	
	public void createStarbucks(){
		System.out.println("Me estoy creando");
	}
	
	public Starbucks getStarbucks(){
		return null;
	}
	
	@Override
	public String toString() {
		return "Starbucksbuilder [drinkname=" + drinkname + ", price=" + price + ", atributo=" + atributo + "]";
	}



}
