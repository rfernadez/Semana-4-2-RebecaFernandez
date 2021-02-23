
package designpattern.builder;

public class Waiter {

	private String name;
	private String lastname;
	private int salary;
	

	// set - get
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void setStarbucksbuilder(Object starbucksbuilder) {
		return;
	}
	
	public Starbucks getstarbucksDrink(){
		return null;
	}
	
	public void constructStarbucks() {
		System.out.println("Estoy listo");
	}

	/**
	 * @param name
	 * @param lastname
	 * @param salary
	 */
	public Waiter(String name, String lastname, int salary) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Waiter [name=" + name + ", lastname=" + lastname + ", salary=" + salary + "]";
	}
	
	
	
}
