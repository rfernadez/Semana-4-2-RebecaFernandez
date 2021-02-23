package designpattern.builder;

public class TeaBuilder extends Starbucksbuilder {
	
	private String teatype;
	private int teaamount;
	private String teabrand;

	//set-get

	/**
	 * @return the teatype
	 */
	public String getTeatype() {
		return teatype;
	}

	/**
	 * @param teatype the teatype to set
	 */
	public void setTeatype(String teatype) {
		this.teatype = teatype;
	}

	/**
	 * @return the teaamount
	 */
	public int getTeaamount() {
		return teaamount;
	}

	/**
	 * @param teaamount the teaamount to set
	 */
	public void setTeaamount(int teaamount) {
		this.teaamount = teaamount;
	}

	/**
	 * @return the teabrand
	 */
	public String getTeabrand() {
		return teabrand;
	}

	/**
	 * @param teabrand the teabrand to set
	 */
	public void setTeabrand(String teabrand) {
		this.teabrand = teabrand;
	}

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
	 * @param teatype
	 * @param teaamount
	 * @param teabrand
	 */
	public TeaBuilder(String drinkname, int price, String atributo, String teatype, int teaamount, String teabrand) {
		super(drinkname, price, atributo);
		this.teatype = teatype;
		this.teaamount = teaamount;
		this.teabrand = teabrand;
	}

	

}
