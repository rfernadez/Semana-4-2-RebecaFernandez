/**
 * 
 */
package herencia;

/**
 * @author rebe2
 *
 */
public class Arbusto extends Vegetal implements Actor {

	private String marca;
	private String nombrecientifico;
	private double años;
	
	//set-get
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
	 * @return the nombrecientifico
	 */
	public String getNombrecientifico() {
		return nombrecientifico;
	}

	/**
	 * @param nombrecientifico the nombrecientifico to set
	 */
	public void setNombrecientifico(String nombrecientifico) {
		this.nombrecientifico = nombrecientifico;
	}

	/**
	 * @return the años
	 */
	public double getAños() {
		return años;
	}

	/**
	 * @param años the años to set
	 */
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

	
	// metodos 
	
	public void metodoA() {
		System.out.println("metodoA");
	}
	
	public void metodoB() {
		System.out.println("metodoB");
	}
	
	public void metodoC() {
		System.out.println("metodoC");
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
	public Arbusto(String tipo, int cantidadhojas, String frutos, String marca, String nombrecientifico, double años) {
		super(tipo, cantidadhojas, frutos);
		this.marca = marca;
		this.nombrecientifico = nombrecientifico;
		this.años = años;
	}


	
}
