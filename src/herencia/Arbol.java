/**
 * 
 */
package herencia;

/**
 * @author rebe2
 *
 */
public class Arbol extends Vegetal implements Actor {
	
	private String marca;
	private String nombrecientifico;
	private double años;
	
	//set-get

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getNombrecientifico() {
		return nombrecientifico;
	}

	public void setNombrecientifico(String nombrecientifico) {
		this.nombrecientifico = nombrecientifico;
	}

	public double getAños() {
		return años;
	}

	public void setAños(double años) {
		this.años = años;
	}
	
	//metodos

	@Override
	public void actuar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void divertir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return super.getTipo();
	}

	@Override
	public void setTipo(String tipo) {
		// TODO Auto-generated method stub
		super.setTipo(tipo);
	}

	@Override
	public int getCantidadhojas() {
		// TODO Auto-generated method stub
		return super.getCantidadhojas();
	}

	@Override
	public void setCantidadhojas(int cantidadhojas) {
		// TODO Auto-generated method stub
		super.setCantidadhojas(cantidadhojas);
	}

	@Override
	public String getFrutos() {
		// TODO Auto-generated method stub
		return super.getFrutos();
	}

	@Override
	public void setFrutos(String frutos) {
		// TODO Auto-generated method stub
		super.setFrutos(frutos);
	}

	@Override
	public void mostrarse() {
		// TODO Auto-generated method stub
		super.mostrarse();
	}

	@Override
	public void desaparecer() {
		// TODO Auto-generated method stub
		super.desaparecer();
	}

	@Override
	public void florear() {
		// TODO Auto-generated method stub
		super.florear();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public void metodo1() {
		System.out.println("metodo1");
	}
	
	public void metodo2() {
		System.out.println("metodo2");
	}
	
	public void metodo3() {
		System.out.println("metodo3");
	}

	//constructor
	/**
	 * @param tipo
	 * @param cantidadhojas
	 * @param frutos
	 * @param marca
	 * @param nombrecientifico
	 * @param años
	 */
	public Arbol(String tipo, int cantidadhojas, String frutos, String marca, String nombrecientifico, double años) {
		super(tipo, cantidadhojas, frutos);
		this.marca = marca;
		this.nombrecientifico = nombrecientifico;
		this.años = años;
	}
	


}
