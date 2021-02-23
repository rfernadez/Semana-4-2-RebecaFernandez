package designpattern.builder;

public class Starbucks {

	private String size;
	private String drink;
	private String flavor;
	
	//set - get
	
	/**
	 * @return the size
	 */
	public String getSize() {
		return size;
	}


	/**
	 * @param size the size to set
	 */
	public void setSize(String size) {
		this.size = size;
	}


	/**
	 * @return the drink
	 */
	public String getDrink() {
		return drink;
	}


	/**
	 * @param drink the drink to set
	 */
	public void setDrink(String drink) {
		this.drink = drink;
	}


	/**
	 * @return the flavor
	 */
	public String getFlavor() {
		return flavor;
	}


	/**
	 * @param flavor the flavor to set
	 */
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}


	/**
	 * @param size
	 * @param drink
	 * @param flavor
	 */
	public Starbucks(String size, String drink, String flavor) {
		this.size = size;
		this.drink = drink;
		this.flavor = flavor;
	}

	public void tomar(){
		System.out.println("Estoy tomando");
	}
	
	public void caliente(){
		System.out.println("Estoy caliente");
	}
	
	public void frio(){
		System.out.println("Estoy frio");
	}

	@Override
	public String toString() {
		return "The Starbucks drinks is:" + " "+ "size=" + " "+ size + " "+ "drink=" + " "+  drink + " "+ "flavor=" + " "+ flavor;
	}



}
