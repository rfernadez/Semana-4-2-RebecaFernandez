package designpattern.builder;

public class Cofferbuilder extends Starbucksbuilder {
	
	private String coffeetype;
	private int coffeeamount;
	private String brand;
	
	//set - get

	/**
	 * @return the coffeetype
	 */
	public String getCoffeetype() {
		return coffeetype;
	}

	/**
	 * @param coffeetype the coffeetype to set
	 */
	public void setCoffeetype(String coffeetype) {
		this.coffeetype = coffeetype;
	}

	/**
	 * @return the coffeeamount
	 */
	public int getCoffeeamount() {
		return coffeeamount;
	}

	/**
	 * @param coffeeamount the coffeeamount to set
	 */
	public void setCoffeeamount(int coffeeamount) {
		this.coffeeamount = coffeeamount;
	}

	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	// metodos heredados
	
	@Override
	public String getDrinkname() {
		// TODO Auto-generated method stub
		return super.getDrinkname();
	}

	@Override
	public void setDrinkname(String drinkname) {
		// TODO Auto-generated method stub
		super.setDrinkname(drinkname);
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return super.getPrice();
	}

	@Override
	public void setPrice(int price) {
		// TODO Auto-generated method stub
		super.setPrice(price);
	}

	@Override
	public String getAtributo() {
		// TODO Auto-generated method stub
		return super.getAtributo();
	}

	@Override
	public void setAtributo(String atributo) {
		// TODO Auto-generated method stub
		super.setAtributo(atributo);
	}

	@Override
	public void buildSize() {
		// TODO Auto-generated method stub
		super.buildSize();
	}

	@Override
	public void buildDrink() {
		// TODO Auto-generated method stub
		super.buildDrink();
	}

	@Override
	public void createStarbucks() {
		// TODO Auto-generated method stub
		super.createStarbucks();
	}

	@Override
	public Starbucks getStarbucks() {
		// TODO Auto-generated method stub
		return super.getStarbucks();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	
	public void enfriarse(){
		System.out.println("Se enfrio");
	}
	
	public void ponersemalo(){
		System.out.println("Me puse malo");
	}
	
	public void calentarse(){
		System.out.println("Se calento");
	}
	
	/**
	 * @param drinkname
	 * @param price
	 * @param atributo
	 * @param coffeetype
	 * @param coffeeamount
	 * @param brand
	 */
	public Cofferbuilder(String drinkname, int price, String atributo, String coffeetype, int coffeeamount,
			String brand) {
		super(drinkname, price, atributo);
		this.coffeetype = coffeetype;
		this.coffeeamount = coffeeamount;
		this.brand = brand;
	}

	
	
	
}
