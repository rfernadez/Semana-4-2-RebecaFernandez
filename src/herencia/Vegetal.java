/**
 * 
 */
package herencia;

/**
 * @author rebe2
 *
 */
	//propiedades 
public class Vegetal {
	public String tipo;
	public int cantidadhojas;
	public String frutos;
	
	//set y get 
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getCantidadhojas() {
		return cantidadhojas;
	}

	public void setCantidadhojas(int cantidadhojas) {
		this.cantidadhojas = cantidadhojas;
	}

	public String getFrutos() {
		return frutos;
	}

	public void setFrutos(String frutos) {
		this.frutos = frutos;
	}

	//constructor
	public Vegetal(String tipo, int cantidadhojas, String frutos) {
		this.tipo = tipo;
		this.cantidadhojas = cantidadhojas;
		this.frutos = frutos;
	}

	//metodos
	public void mostrarse () {
		System.out.println("Hola");
	}
	
	public void desaparecer () {
		System.out.println("Adios");
	}
	
	public void florear () {
		System.out.println("Tengo frutos!");
	}

	@Override
	public String toString() {
		return "Estas son mis propiedades:" + "tipo:" + " "+ this.tipo + " "+ "cantidadhojas:" 
+ " "+ this.cantidadhojas + " "+ "frutos:" + " "+ this.frutos;
	}
	
	
	/**
	 * 
	 */
	

}
