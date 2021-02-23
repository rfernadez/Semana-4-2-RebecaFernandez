/**
 * 
 */
package herencia;

/**
 * @author rebe2
 *
 */
public class Coche extends Vehiculo implements Actor {

	private String atributo1;
	private int atributo2;
	private String atributo3;
	
	//set - get
	/**
	 * @return the atributo1
	 */
	public String getAtributo1() {
		return atributo1;
	}

	/**
	 * @param atributo1 the atributo1 to set
	 */
	public void setAtributo1(String atributo1) {
		this.atributo1 = atributo1;
	}

	/**
	 * @return the atributo2
	 */
	public int getAtributo2() {
		return atributo2;
	}

	/**
	 * @param atributo2 the atributo2 to set
	 */
	public void setAtributo2(int atributo2) {
		this.atributo2 = atributo2;
	}

	/**
	 * @return the atributo3
	 */
	public String getAtributo3() {
		return atributo3;
	}

	/**
	 * @param atributo3 the atributo3 to set
	 */
	public void setAtributo3(String atributo3) {
		this.atributo3 = atributo3;
	}

	@Override
	public String getMarca() {
		// TODO Auto-generated method stub
		return super.getMarca();
	}

	// metodos heredados
	
	@Override
	public void setMarca(String marca) {
		// TODO Auto-generated method stub
		super.setMarca(marca);
	}

	@Override
	public int getAño() {
		// TODO Auto-generated method stub
		return super.getAño();
	}

	@Override
	public void setAño(int año) {
		// TODO Auto-generated method stub
		super.setAño(año);
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return super.getColor();
	}

	@Override
	public void setColor(String color) {
		// TODO Auto-generated method stub
		super.setColor(color);
	}

	@Override
	public void poner() {
		// TODO Auto-generated method stub
		super.poner();
	}

	@Override
	public void quitar() {
		// TODO Auto-generated method stub
		super.quitar();
	}

	@Override
	public void mover() {
		// TODO Auto-generated method stub
		System.out.println("Me estoy moviendo");
	}

	@Override
	public void actuar() {
		// TODO Auto-generated method stub
		super.actuar();
	}

	@Override
	public void divertir() {
		// TODO Auto-generated method stub
		super.divertir();
	}

	@Override
	public void desaparecer() {
		// TODO Auto-generated method stub
		super.desaparecer();
	}

	@Override
	public void frenar() {
		// TODO Auto-generated method stub
		super.frenar();
	}

	@Override
	public void acelerando() {
		// TODO Auto-generated method stub
		super.acelerando();
	}

	@Override
	public void detenido() {
		// TODO Auto-generated method stub
		super.detenido();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	
	//metodos
	
	public void metodo1() {
		System.out.println("metodo1");
	}
	
	public void metodo2() {
		System.out.println("metodo2");
	}
	
	public void metodo3() {
		System.out.println("metodo3");
	}

	/**
	 * @param marca
	 * @param año
	 * @param color
	 * @param atributo1
	 * @param atributo2
	 * @param atributo3
	 */
	public Coche(String marca, int año, String color, String atributo1, int atributo2, String atributo3) {
		super(marca, año, color);
		this.atributo1 = atributo1;
		this.atributo2 = atributo2;
		this.atributo3 = atributo3;
	}
	
	
}
