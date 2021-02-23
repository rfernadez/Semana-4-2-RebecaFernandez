/**
 * 
 */
package herencia;

/**
 * @author rebe2
 *
 */
public class Vehiculo implements Actor, Objetoinerte {
	
	private String marca;
	private int a�o;
	private String color;
	
	//set - get

	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * @return the a�o
	 */
	public int getA�o() {
		return a�o;
	}

	/**
	 * @param a�o the a�o to set
	 */
	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	// metodos heredados

	@Override
	public void poner() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void quitar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mover() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actuar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void divertir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void desaparecer() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * 
	 */
	//metodos 
	
	public void frenar(){
		System.out.println("Estoy frenando");
	}
	
	public void acelerando(){
		System.out.println("Estoy acelerando");
	}
	
	public void detenido(){
		System.out.println("Estoy detenido");
	}

	//constructor
	/**
	 * @param marca
	 * @param a�o
	 * @param color
	 */
	public Vehiculo(String marca, int a�o, String color) {
		super();
		this.marca = marca;
		this.a�o = a�o;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Las caracteristicas del vehiculo son:"+"marca:" +" "+ marca + " "+ "a�o:" + " "+ a�o + " "+ "color:" + " "+ color;
	}

	

}
