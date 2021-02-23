/**
 * 
 */
package designpattern.builder;

/**
 * @author rebe2
 *
 */
public class Customer {

	private static Object Starbucksbuilder;

	/**
	 * 
	 */
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Starbucks star1= new Starbucks("Venti", "Coffee", "Mocha");
		star1.frio();
		star1.setFlavor("vainilla");
		System.out.println(star1.toString());
	
		Starbucksbuilder starbuild1= new Starbucksbuilder("frapuccino", 3000, "pequeño");
		starbuild1.buildSize();
		starbuild1.setPrice(2000);
		System.out.println(starbuild1.toString());
		
		Cofferbuilder coffbuild1= new Cofferbuilder("Americano", 3000, "grande", "grano", 600, "Britt");
		coffbuild1.buildDrink();
		coffbuild1.setBrand("1820");
		System.out.println(coffbuild1.toString());
		
		TeaBuilder teabuild1= new TeaBuilder("Chai", 2500, "leche", "Matcha", 550, "Manzate");
		teabuild1.enfriarse();
		teabuild1.setTeaamount(450);
		System.out.println(teabuild1.toString());
		
		Waiter waiter1= new Waiter("Peter", "Smith", 500);
		waiter1.constructStarbucks();
		waiter1.setStarbucksbuilder(Starbucksbuilder);
		System.out.println(waiter1.toString());
		
		
	}
	

}
